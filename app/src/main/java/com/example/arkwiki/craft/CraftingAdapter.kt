package com.example.arkwiki.craft

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.bundleOf
import androidx.fragment.app.commit
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.arkwiki.R

class CraftingAdapter(private val craftingItems: List<Crafting>) : RecyclerView.Adapter<CraftingAdapter.CraftingViewHolder>() {
    class CraftingViewHolder(itemView: View, private val onCraftingClicked: (position: Int) -> Unit
    ) : RecyclerView.ViewHolder(itemView)
    {
        init {
            itemView.setOnClickListener {
                onCraftingClicked(adapterPosition)
            }
        }

        val craftingImage: ImageView = itemView.findViewById(R.id.card_image)
        val craftingName: TextView = itemView.findViewById(R.id.card_title)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CraftingViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.card_view, parent, false)

        return CraftingViewHolder(view) { adapterPosition ->
            val crafting = craftingItems[adapterPosition]

            val bundle = bundleOf(
                "name" to crafting.name,
                "style" to crafting.style,
                "durability" to crafting.durability,
                "image" to crafting.image,
                "ingredients" to crafting.ingredients,
            )

            val detailFragment = CraftingDetailFragment()
            detailFragment.arguments = bundle

            val activity = view.context as AppCompatActivity
            activity.supportFragmentManager.commit {
                setReorderingAllowed(true)
                replace(R.id.fragment_container_view, detailFragment)
                addToBackStack(null)
            }
        }
    }

    override fun getItemCount(): Int {
        return craftingItems.size
    }

    override fun onBindViewHolder(holder: CraftingViewHolder, position: Int) {
        val crafting = craftingItems[position]

        holder.craftingName.text = crafting.name
        Glide.with(holder.itemView.context).load(crafting.image).placeholder(R.drawable.ic_launcher_foreground).into(holder.craftingImage)
    }
}