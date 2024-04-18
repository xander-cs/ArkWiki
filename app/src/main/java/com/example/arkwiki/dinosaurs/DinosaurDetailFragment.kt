package com.example.arkwiki.dinosaurs

import android.media.MediaPlayer
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.example.arkwiki.R

class DinosaurDetailFragment : Fragment() {
    private lateinit var mediaPlayer: MediaPlayer

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_dinosaur_detail, container, false)
        mediaPlayer = MediaPlayer()

        if (arguments != null)
        {
            val name = requireArguments().getString("name")
            val diet = requireArguments().getString("diet")
            val temperament = requireArguments().getString("temperament")
            val food = requireArguments().getString("food")
            val image = requireArguments().getString("image")
            val roar = requireArguments().getString("roar")

            val dietImage = getDietImage(diet)

            Glide.with(this).load(image).placeholder(R.drawable.ic_launcher_foreground).into(view.findViewById(R.id.dinosaur_image_detail))
            Glide.with(this).load(dietImage).placeholder(R.drawable.ic_launcher_foreground).into(view.findViewById(R.id.dinosaur_diet_image_detail))

            view.findViewById<TextView>(R.id.dinosaur_name_detail).text = name
            view.findViewById<TextView>(R.id.dinosaur_diet_text_detail).text = diet
            view.findViewById<TextView>(R.id.dinosaur_temperament_detail).text = resources.getString(R.string.dinosaur_temperament, temperament)
            view.findViewById<TextView>(R.id.dinosaur_food_detail).text = resources.getString(R.string.preferred_food, food)

            view.findViewById<ImageView>(R.id.dinosaur_image_detail).setOnClickListener {
                if (!mediaPlayer.isPlaying) {
                    mediaPlayer.apply {
                        reset()
                        setDataSource(roar)
                        prepareAsync()
                        setOnPreparedListener {
                            it.start()
                        }
                    }
                }
            }
        }

        return view
    }

    private fun getDietImage(diet: String?): String {
        return when (diet) {
            "Carnivore" -> "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/e/e9/Raw_Meat.png/revision/latest?cb=20150704150605"
            "Herbivore" -> "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/d/de/Fresh_Tea_Leaves_%28Primitive_Plus%29.png/revision/latest?cb=20160823061734"
            "Piscivore" -> "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/2/24/Render_Coel.png/revision/latest?cb=20150915105355"
            else -> ""
        }
    }
}