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
import com.example.arkwiki.dinosaurs.arks.ArkAdapter

class ArkListFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_ark_list, container, false)
        val recyclerView: RecyclerView = view.findViewById(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        val arks = mutableListOf<Card>()
        arks.add(Card("All", ""))
        arks.add(Card("Island", ""))
        arks.add(Card("Desert", ""))
        arks.add(Card("Underground", ""))
        arks.add(Card("Corrupted Earth", ""))
        arks.add(Card("Simulation", ""))
        arks.add(Card("Colony Ship", ""))
        arks.add(Card("The Center", ""))
        arks.add(Card("Norse", ""))
        arks.add(Card("Grand", ""))
        arks.add(Card("Crystalline", ""))
        arks.add(Card("Lost Island", ""))

        val adapter = ArkAdapter(arks)
        recyclerView.adapter = adapter

        return view
    }
}