package com.example.arkwiki.breedingtaming

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.arkwiki.R

class BreedingDetailFragment  : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_breeding_detail, container, false)

        if (arguments != null) {
            view.findViewById<TextView>(R.id.mating_requirements_title_detail).text = getString(R.string.requirements_title)
            view.findViewById<TextView>(R.id.mating_requirements_detail).text = getString(R.string.requirements)
            view.findViewById<TextView>(R.id.range_title_detail).text = getString(R.string.range_title)
            view.findViewById<TextView>(R.id.nv_detail).text = getString(R.string.range)
            view.findViewById<TextView>(R.id.unv_title_detail).text = getString(R.string.mating_title)
            view.findViewById<TextView>(R.id.mating_detail).text = getString(R.string.mating)
            view.findViewById<TextView>(R.id.tt_title_detail).text = getString(R.string.special_conditions_title)
            view.findViewById<TextView>(R.id.tt_detail).text = getString(R.string.special_conditions)
            view.findViewById<TextView>(R.id.ro_title_detail).text = getString(R.string.wait_title)
            view.findViewById<TextView>(R.id.ro_detail).text = getString(R.string.wait)
            view.findViewById<TextView>(R.id.incubation_title_detail).text = getString(R.string.incubation_title)
            view.findViewById<TextView>(R.id.incubation_detail).text = getString(R.string.incubation)
        }

        return view
    }
}