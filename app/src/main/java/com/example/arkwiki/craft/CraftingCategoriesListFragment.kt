package com.example.arkwiki.craft

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.arkwiki.Card
import com.example.arkwiki.R

class CraftingCategoriesListFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_list, container, false)
        val recyclerView: RecyclerView = view.findViewById(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        val categories = listOf(
            Card("Clothing", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/f/f3/Hide_Shirt.png/revision/latest?cb=20150615102418"),
            Card("Tools", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/9/9f/Metal_Pick.png/revision/latest?cb=20150615120217"),
            Card("Structures", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/d/d0/Storage_Box.png/revision/latest?cb=20150615115357"),
            Card("Weapons", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/c/c8/Wooden_Club.png/revision/latest?cb=20151003050839"),
        )

        val adapter = CraftingCategoriesAdapter(categories)
        recyclerView.adapter = adapter

        return view
    }
}