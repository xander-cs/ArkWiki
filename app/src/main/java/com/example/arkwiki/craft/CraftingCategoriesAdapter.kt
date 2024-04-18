package com.example.arkwiki.craft

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.commit
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.arkwiki.Card
import com.example.arkwiki.R
import com.google.gson.Gson

class CraftingCategoriesAdapter(private val craft: List<Card>) : RecyclerView.Adapter<CraftingCategoriesAdapter.CraftViewHolder>() {
    class CraftViewHolder(
        itemView: View,
        private val onCraftClicked: (position: Int) -> Unit
    ) : RecyclerView.ViewHolder(itemView)
    {
        init {
            itemView.setOnClickListener {
                onCraftClicked(adapterPosition)
            }
        }

        val craftTitle: TextView = itemView.findViewById(R.id.card_title)
        val craftImage: ImageView = itemView.findViewById(R.id.card_image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CraftViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.card_view, parent, false)

        return CraftViewHolder(view) { adapterPosition ->
            val craftingListFragment = CraftingListFragment()

            when (adapterPosition) {
                0 -> {
                    craftingListFragment.arguments = Bundle().apply {
                        putString("craftingItems", Gson().toJson(clothing))
                    }
                }
                1 -> {
                    craftingListFragment.arguments = Bundle().apply {
                        putString("craftingItems", Gson().toJson(tools))
                    }
                }
                2 -> {
                    craftingListFragment.arguments = Bundle().apply {
                        putString("craftingItems", Gson().toJson(structures))
                    }
                }
                3 -> {
                    craftingListFragment.arguments = Bundle().apply {
                        putString("craftingItems", Gson().toJson(weapons))
                    }
                }
            }

            val activity = view.context as AppCompatActivity
            activity.supportFragmentManager.commit {
                setReorderingAllowed(true)
                replace(R.id.fragment_container_view, craftingListFragment)
                addToBackStack(null)
            }
        }
    }

    override fun getItemCount(): Int {
        return craft.size
    }

    override fun onBindViewHolder(holder: CraftViewHolder, position: Int) {
        val craft = craft[position]

        Glide.with(holder.itemView.context).load(craft.image).placeholder(R.drawable.ic_launcher_foreground).into(holder.craftImage)
        holder.craftTitle.text = craft.title

    }
}