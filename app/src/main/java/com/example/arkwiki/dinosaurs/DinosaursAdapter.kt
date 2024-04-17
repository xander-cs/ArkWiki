package com.example.arkwiki.dinosaurs

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.arkwiki.R
import com.example.arkwiki.dinosaurs.arks.ArkAdapter
import org.w3c.dom.Text

class DinosaursAdapter(private val dinosaurs: List<Dinosaur>) : RecyclerView.Adapter<DinosaursAdapter.DinosaurViewHolder>() {
//    class DinosaurViewHolder(
//        itemView: View,
//        private val onDinosaurClicked: (position: Int) -> Unit
//    ) : RecyclerView.ViewHolder(itemView)
//    {
//        init {
//            itemView.setOnClickListener{
//                onDinosaurClicked(adapterPosition)
//            }
//        }
//
//        val dinosaurName: TextView = itemView.findViewById(R.id.card_title)
//        val dinosaurImage: ImageView = itemView.findViewById(R.id.card_image)
//    }

    class DinosaurViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)
    {
        val dinosaurName: TextView = itemView.findViewById(R.id.card_title)
        val dinosaurImage: ImageView = itemView.findViewById(R.id.card_image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DinosaurViewHolder
    {
        return DinosaurViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.card_view, parent, false)
        )
    }

    override fun getItemCount(): Int
    {
        return dinosaurs.size
    }

    override fun onBindViewHolder(holder: DinosaurViewHolder, position: Int)
    {
        val dinosaur = dinosaurs[position]

        holder.dinosaurName.text = dinosaur.name
        Glide.with(holder.itemView.context).load(dinosaur.image).placeholder(R.drawable.ic_launcher_foreground).into(holder.dinosaurImage)
    }
}