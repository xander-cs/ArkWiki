package com.example.arkwiki.craft

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.arkwiki.R
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class CraftingDetailFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_crafting_detail, container, false)
        val recyclerView: RecyclerView = view.findViewById(R.id.recycler_view)
        recyclerView.layoutManager = GridLayoutManager(requireContext(), 2)

        if (arguments != null) {
            val name = requireArguments().getString("name")
            val type = requireArguments().getString("style")
            val durability = requireArguments().getString("durability")
            val image = requireArguments().getString("image")

            val gson = Gson()
            val ingredients = gson.fromJson<List<Ingredient>>(requireArguments().getString("ingredients"), object : TypeToken<List<Ingredient>>() {}.type)

            Glide.with(this)
                .load(image)
                .placeholder(R.drawable.ic_placeholder)
                .into(view.findViewById(R.id.craft_image_detail))

            view.findViewById<TextView>(R.id.craft_name_detail).text = name
            view.findViewById<TextView>(R.id.craft_type_detail).text = resources.getString(R.string.type, type)
            view.findViewById<TextView>(R.id.craft_durability_detail).text = resources.getString(R.string.durability, durability)
            view.findViewById<TextView>(R.id.craft_ingredients_detail).text = resources.getString(R.string.ingredients)

            val adapter = IngredientsAdapter(ingredients)
            recyclerView.adapter = adapter
        }

        return view
    }
}

