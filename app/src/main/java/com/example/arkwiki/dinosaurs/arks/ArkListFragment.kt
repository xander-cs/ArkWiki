package com.example.arkwiki.dinosaurs.arks

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.arkwiki.Card
import com.example.arkwiki.R
import com.example.arkwiki.model.ArkViewModel

class ArkListFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_list, container, false)
        val recyclerView: RecyclerView = view.findViewById(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        val viewModel = ArkViewModel()

        val adapter = ArkAdapter(viewModel.arks)
        recyclerView.adapter = adapter

        return view
    }
}