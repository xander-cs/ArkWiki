package com.example.arkwiki.breedingtaming

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.arkwiki.R

class TamingDetailFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view = inflater.inflate(R.layout.fragment_taming_detail, container, false)

        if (arguments != null) {
            view.findViewById<TextView>(R.id.ko_title_detail).text = getString(R.string.ko_title)
            view.findViewById<TextView>(R.id.ko_detail).text = getString(R.string.ko)
            view.findViewById<TextView>(R.id.nv_title_detail).text = getString(R.string.nv_title)
            view.findViewById<TextView>(R.id.nv_detail).text = getString(R.string.nv)
            view.findViewById<TextView>(R.id.unv_title_detail).text = getString(R.string.unv_title)
            view.findViewById<TextView>(R.id.unv_detail).text = getString(R.string.unv)
            view.findViewById<TextView>(R.id.tt_title_detail).text = getString(R.string.tt_title)
            view.findViewById<TextView>(R.id.tt_detail).text = getString(R.string.tt)
            view.findViewById<TextView>(R.id.ro_title_detail).text = getString(R.string.ro_title)
            view.findViewById<TextView>(R.id.ro_detail).text = getString(R.string.ro)
        }

        return view
    }
}