package com.example.arkwiki.dinosaurs

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
import com.example.arkwiki.R

class DinosaurAdapter(private val dinosaurs: List<Dinosaur>) : RecyclerView.Adapter<DinosaurAdapter.DinosaurViewHolder>() {

    class DinosaurViewHolder(itemView: View, private val onDinosaurClicked: (position: Int) -> Unit
    ) : RecyclerView.ViewHolder(itemView)
    {
        init {
            itemView.setOnClickListener{
                onDinosaurClicked(adapterPosition)
            }
        }

        val dinosaurImage: ImageView = itemView.findViewById(R.id.card_image)
        val dinosaurName: TextView = itemView.findViewById(R.id.card_title)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DinosaurViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.card_view, parent, false)

        return DinosaurViewHolder(view) { adapterPosition ->
            val dinosaur = dinosaurs[adapterPosition]

            val bundle = bundleOf(
                "name" to dinosaur.name,
                "diet" to dinosaur.diet.toString(),
                "temperament" to dinosaur.temperament,
                "food" to dinosaur.preferredFood,
                "image" to dinosaur.image,
                "roar" to dinosaur.roar,
            )

            val detailFragment = DinosaurDetailFragment()
            detailFragment.arguments = bundle

            val activity = view.context as AppCompatActivity
            activity.supportFragmentManager.commit {
                setReorderingAllowed(true)
                replace(R.id.fragment_container_view, detailFragment)
                addToBackStack(null)
            }
        }
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