package com.example.arkwiki.craft

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
 import com.example.arkwiki.R

class CraftingDetailFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_crafting_detail, container, false)

        if (arguments != null) {
            val name = requireArguments().getString("name")
            val type = requireArguments().getString("style")
            val durability = requireArguments().getString("durability")
            val image = requireArguments().getString("image")
            val ingredients = requireArguments().getString("ingredients")

            Glide.with(this)
                .load(image)
                .placeholder(R.drawable.ic_launcher_background)
                .into(view.findViewById(R.id.craft_image_detail))

            view.findViewById<TextView>(R.id.craft_name_detail).text = name
            view.findViewById<TextView>(R.id.craft_type_detail).text = resources.getString(R.string.type, type)
            view.findViewById<TextView>(R.id.craft_durability_detail).text = resources.getString(R.string.durability, durability)
            view.findViewById<TextView>(R.id.craft_ingredients_detail).text = resources.getString(R.string.ingredients, ingredients)
        }
        return view
    }
}

