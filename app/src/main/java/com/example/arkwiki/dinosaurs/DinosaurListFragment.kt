package com.example.arkwiki.dinosaurs

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.arkwiki.R

class DinosaurListFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_dinosaurs_list, container, false)
        val recyclerView: RecyclerView = view.findViewById(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        var toPass = mutableListOf<Dinosaur>()

        if (arguments != null)
        {
            val typeString = requireArguments().getString("type")

            if (typeString == "All")
            {
                toPass = dinosaurs.toMutableList()
            } else
            {
                val type = stringToType(typeString)
                for(dinosaur in dinosaurs)
                {
                    if (dinosaur.types.contains(type))
                    {
                        toPass.add(dinosaur)
                    }
                }
            }
        }

        val adapter = DinosaursAdapter(toPass)
        recyclerView.adapter = adapter

        return view
    }

    private fun stringToType(typeString: String?): Type {
        return when (typeString) {
            "Island" -> Type.ISLAND
            "Desert" -> Type.DESERT
            "Underground" -> Type.UNDERGROUND
            "Corrupted Earth" -> Type.CORRUPTED
            "Simulation" -> Type.SIMULATION
            "Colony Ship" -> Type.COLONY
            "The Center" -> Type.CENTER
            "Norse" -> Type.NORSE
            "Crystalline" -> Type.CRYSTALLINE
            "Lost Island" -> Type.LOST
            else -> Type.ISLAND
        }
    }
}