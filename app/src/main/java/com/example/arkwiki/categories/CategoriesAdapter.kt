package com.example.arkwiki.categories

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.arkwiki.R

class CategoriesAdapter(private val categories: List<Category>) : RecyclerView.Adapter<CategoriesAdapter.CategoryViewHolder>() {
    class CategoryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
    {
        val categoryTitle: TextView = itemView.findViewById(R.id.category_title)
        val categoryImage: ImageView = itemView.findViewById(R.id.category_image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoryViewHolder {
        return CategoryViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.category_card_view, parent, false)
        )
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