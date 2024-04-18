package com.example.arkwiki.craft

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.arkwiki.R
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class CraftingListFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_list, container, false)
        val recyclerView: RecyclerView = view.findViewById(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        var craftingItems = emptyList<Crafting>()

        if(arguments != null)
        {
            val gson = Gson()
            craftingItems = gson.fromJson(requireArguments().getString("craftingItems"), object : TypeToken<List<Crafting>>() {}.type)
        }

        val adapter = CraftingAdapter(craftingItems)
        recyclerView.adapter = adapter

        return view
    }
}