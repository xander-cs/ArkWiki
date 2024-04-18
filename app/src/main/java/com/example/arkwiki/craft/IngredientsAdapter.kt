package com.example.arkwiki.craft

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.arkwiki.R

class IngredientsAdapter(private val ingredients: List<Ingredient>) : RecyclerView.Adapter<IngredientsAdapter.IngredientsViewHolder>() {
    class IngredientsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
    {
        val ingredientImage: ImageView = itemView.findViewById(R.id.ingredient_image)
        val ingredientText: TextView = itemView.findViewById(R.id.ingredient_text)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): IngredientsViewHolder {
        return IngredientsViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.ingredient_card_view, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return ingredients.size
    }

    override fun onBindViewHolder(holder: IngredientsViewHolder, position: Int) {
        val ingredient = ingredients[position]

        holder.ingredientText.text = holder.itemView.resources.getString(R.string.ingredient, ingredient.amount.toString(), ingredient.name)
        Glide.with(holder.itemView.context).load(ingredient.image).placeholder(R.drawable.ic_launcher_foreground).into(holder.ingredientImage)
    }

}