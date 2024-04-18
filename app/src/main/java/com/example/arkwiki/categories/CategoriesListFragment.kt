package com.example.arkwiki.categories

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.arkwiki.Card
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

        val categories = mutableListOf<Card>()
        categories.add(Card("Breeding &\nTaming", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/a/a3/Eggs.png/revision/latest?cb=20200807154254"))
        categories.add(Card("Crafting", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/b/b9/Smithy.png/revision/latest?cb=20150615134739"))
        categories.add(Card("Dinosaurs", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/8/8d/Alpha_T-Rex.png/revision/latest?cb=20190228120718"))

        val adapter = CategoriesAdapter(categories)
        recyclerView.adapter = adapter

        return view
    }
}