package com.example.arkwiki.categories

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.arkwiki.Card
import com.example.arkwiki.R
import com.example.arkwiki.craft.CraftingCategoriesListFragment
import com.example.arkwiki.dinosaurs.arks.ArkListFragment
import com.example.arkwiki.breedingtaming.BreedingDetailFragment
import com.example.arkwiki.breedingtaming.TamingDetailFragment

@Suppress("DEPRECATION")
class CategoriesAdapter(private val categories: List<Card>) : RecyclerView.Adapter<CategoriesAdapter.CategoryViewHolder>() {
    class CategoryViewHolder(
        itemView: View,
        private val onCategoryClicked: (position: Int) -> Unit
    ) : RecyclerView.ViewHolder(itemView)
    {
        init {
            itemView.setOnClickListener {
                onCategoryClicked(adapterPosition)
            }
        }

        val categoryTitle: TextView = itemView.findViewById(R.id.card_title)
        val categoryImage: ImageView = itemView.findViewById(R.id.card_image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.card_view, parent, false)

        return CategoryViewHolder(view) { adapterPosition ->
            var fragment: Fragment = CategoriesListFragment()

            when (adapterPosition) {
                0 -> {
                    fragment = BreedingDetailFragment()
                    fragment.arguments = bundleOf()
                }
                1 -> {
                    fragment = CraftingCategoriesListFragment()
                }
                2 -> {
                    fragment = ArkListFragment()
                }
                3 -> {
                    fragment = TamingDetailFragment()
                    fragment.arguments = bundleOf()
                }
            }

            val activity = view.context as AppCompatActivity
            activity.supportFragmentManager.commit {
                setReorderingAllowed(true)
                replace(R.id.fragment_container_view, fragment)
                addToBackStack(null)
            }
        }
    }

    override fun getItemCount(): Int {
        return categories.size
    }

    override fun onBindViewHolder(holder: CategoryViewHolder, position: Int) {
        val category = categories[position]

        Glide.with(holder.itemView.context).load(category.image).placeholder(R.drawable.ic_launcher_foreground).into(holder.categoryImage)
        holder.categoryTitle.text = category.title

    }
}