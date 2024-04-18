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
        arks.add(Card("All", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/5/5b/ARK_Icon.png/revision/latest?cb=20190106013307"))
        arks.add(Card("Island", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/0/04/The_Island_Topographic_Map.jpg/revision/latest/scale-to-width-down/1000?cb=20181020211505"))
        arks.add(Card("Desert", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/3/39/Scorched_Earth_Topographic_Map.jpg/revision/latest/scale-to-width-down/1000?cb=20181020211511"))
        arks.add(Card("Underground", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/6/68/Aberration_Map.jpg/revision/latest/scale-to-width-down/1000?cb=20220905075434"))
        arks.add(Card("Corrupted Earth", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/0/0b/Extinction_Topographic_Map.jpg/revision/latest/scale-to-width-down/1000?cb=20190122164234"))
        arks.add(Card("Simulation", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/3/37/Genesis_Part_1_Topographic_Map.jpg/revision/latest/scale-to-width-down/1000?cb=20220905121759"))
        arks.add(Card("Colony Ship", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/4/44/Genesis_Part_2_Map.jpg/revision/latest/scale-to-width-down/1000?cb=20210603191823"))
        arks.add(Card("The Center", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/5/58/The_Center_Topographic_Map.jpg/revision/latest/scale-to-width-down/1000?cb=20161126134907"))
        arks.add(Card("Norse", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/8/88/Ragnarok_Topographic_Map.jpg/revision/latest/scale-to-width-down/1000?cb=20181020195310"))
        arks.add(Card("Grand", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/d/de/Valguero_Topographic_Map.jpg/revision/latest/scale-to-width-down/1000?cb=20220326124105"))
        arks.add(Card("Crystalline", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/7/70/Crystal_Isles_Topographic_Map.jpg/revision/latest/scale-to-width-down/1000?cb=20200705193753"))
        arks.add(Card("Lost Island", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/4/45/Lost_Island_map.jpg/revision/latest/scale-to-width-down/1000?cb=20211214195403"))

        val adapter = ArkAdapter(arks)
        recyclerView.adapter = adapter

        return view
    }
}