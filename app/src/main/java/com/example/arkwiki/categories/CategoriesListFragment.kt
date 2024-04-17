package com.example.arkwiki.categories

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.arkwiki.R

class CategoriesListFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_categories_list, container, false)
        val recyclerView: RecyclerView = view.findViewById(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        val categories = mutableListOf<Category>()
        categories.add(Category("Breeding", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/a/a3/Eggs.png/revision/latest?cb=20200807154254"))
        categories.add(Category("Crafting", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/b/b9/Smithy.png/revision/latest?cb=20150615134739"))
        categories.add(Category("Creatures", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/8/8d/Alpha_T-Rex.png/revision/latest?cb=20190228120718"))
        categories.add(Category("Taming", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/c/cc/Box_o%27_Chocolates.png/revision/latest?cb=20160228212112"))
        categories.add(Category("Tips", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/5/5f/Magnifying_Glass.png/revision/latest?cb=20220905113952"))

        val adapter = CategoriesAdapter(categories)
        recyclerView.adapter = adapter

        return view
    }
}