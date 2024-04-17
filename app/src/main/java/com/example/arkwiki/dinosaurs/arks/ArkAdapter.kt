package com.example.arkwiki.dinosaurs.arks

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.bundleOf
import androidx.fragment.app.commit
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.arkwiki.Card
import com.example.arkwiki.R
import com.example.arkwiki.dinosaurs.DinosaurListFragment

class ArkAdapter(private val arks: List<Card>) : RecyclerView.Adapter<ArkAdapter.ArkViewHolder>() {
    class ArkViewHolder(
        itemView: View,
        private val onArkClicked: (position: Int) -> Unit
    ) : RecyclerView.ViewHolder(itemView)
    {
        init {
            itemView.setOnClickListener {
                onArkClicked(adapterPosition)
            }
        }

        val arkTitle: TextView = itemView.findViewById(R.id.card_title)
        val arkImage: ImageView = itemView.findViewById(R.id.card_image)
    }

    override fun getItemCount(): Int {
        return arks.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArkViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.card_view, parent, false)

         return  ArkViewHolder(view) { adapterPosition ->
             val ark = arks[adapterPosition]

             val bundle = bundleOf("type" to ark.title,)

             val dinosaurListFragment = DinosaurListFragment()
             dinosaurListFragment.arguments = bundle

             val activity = view.context as AppCompatActivity
             activity.supportFragmentManager.commit {
                 setReorderingAllowed(true)
                 replace(R.id.fragment_container_view, dinosaurListFragment)
                 addToBackStack(null)
             }
         }
    }

    override fun onBindViewHolder(holder: ArkViewHolder, position: Int) {
        val ark = arks[position]

        Glide.with(holder.itemView.context).load(ark.image).placeholder(R.drawable.ic_launcher_foreground).into(holder.arkImage)
        holder.arkTitle.text = ark.title
    }
}