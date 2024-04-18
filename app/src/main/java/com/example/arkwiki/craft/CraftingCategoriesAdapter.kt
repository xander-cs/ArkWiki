package com.example.arkwiki.craft

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.commit
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.arkwiki.Card
import com.example.arkwiki.R
import com.google.gson.Gson

class CraftingCategoriesAdapter(private val craft: List<Card>) : RecyclerView.Adapter<CraftingCategoriesAdapter.CraftViewHolder>() {
    class CraftViewHolder(
        itemView: View,
        private val onCraftClicked: (position: Int) -> Unit
    ) : RecyclerView.ViewHolder(itemView)
    {
        init {
            itemView.setOnClickListener {
                onCraftClicked(adapterPosition)
            }
        }

        val craftTitle: TextView = itemView.findViewById(R.id.card_title)
        val craftImage: ImageView = itemView.findViewById(R.id.card_image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CraftViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.card_view, parent, false)

        return CraftViewHolder(view) { adapterPosition ->
            val craftingListFragment = CraftingListFragment()

            when (adapterPosition) {
                0 -> {
                    craftingListFragment.arguments = Bundle().apply {
                        putString("craftingItems", Gson().toJson(clothing))
                    }
                }
                1 -> {
                    craftingListFragment.arguments = Bundle().apply {
                        putString("craftingItems", Gson().toJson(tools))
                    }
                }
                2 -> {
                    craftingListFragment.arguments = Bundle().apply {
                        putString("craftingItems", Gson().toJson(structures))
                    }
                }
                3 -> {
                    craftingListFragment.arguments = Bundle().apply {
                        putString("craftingItems", Gson().toJson(weapons))
                    }
                }
            }

            val activity = view.context as AppCompatActivity
            activity.supportFragmentManager.commit {
                setReorderingAllowed(true)
                replace(R.id.fragment_container_view, craftingListFragment)
                addToBackStack(null)
            }
        }
    }

    override fun getItemCount(): Int {
        return craft.size
    }

    override fun onBindViewHolder(holder: CraftViewHolder, position: Int) {
        val craft = craft[position]

        Glide.with(holder.itemView.context).load(craft.image).placeholder(R.drawable.ic_launcher_foreground).into(holder.craftImage)
        holder.craftTitle.text = craft.title

    }

    private val clothing = listOf<Crafting>(
        Crafting("Cloth Hat", "Cloth", "25", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/4/42/Cloth_Hat.png/revision/latest?cb=20200518133005", ""),
        Crafting("Cloth Shirt", "Cloth", "25", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/f/f0/Cloth_Shirt.png/revision/latest?cb=20200518133025", ""),
        Crafting("Cloth Pants", "Cloth", "25", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/6/69/Cloth_Pants.png/revision/latest?cb=20200518133049", ""),
        Crafting("Cloth Boots", "Cloth", "25", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/3/36/Cloth_Boots.png/revision/latest?cb=20200518133122", ""),
        Crafting("Cloth Gloves", "Cloth", "25", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/9/9e/Cloth_Gloves.png/revision/latest?cb=20200518133039", ""),
        Crafting("Fur Cap", "Fur", "120", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/f/fe/Fur_Cap.png/revision/latest?cb=20150927232204", ""),
        Crafting("Fur Chestpiece", "Fur", "120", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/b/b3/Fur_Chestpiece.png/revision/latest?cb=20150927232320", ""),
        Crafting("Fur Leggings", "Fur", "120", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/9/9c/Fur_Leggings.png/revision/latest?cb=20150927232246", ""),
        Crafting("Fur Boots", "Fur", "120", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/6/63/Fur_Boots.png/revision/latest?cb=20150927232047", ""),
        Crafting("Fur Gauntlets", "Fur", "120", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/c/c5/Fur_Gauntlets.png/revision/latest?cb=20150927232129", ""),
    )

    private val tools = listOf(
        Crafting("Stone Pick", "Tool", "40", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/1/16/Stone_Pick.png/revision/latest?cb=20150615120311", ""),
        Crafting("Stone Hatchet", "Tool", "40", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/d/d6/Stone_Hatchet.png/revision/latest?cb=20150615120258", "Flint"),
        Crafting("Torch", "Melee", "40", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/b/b2/Torch.png/revision/latest?cb=20150615120234", ""),
        Crafting("Chainsaw", "Tool", "80", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/5/5f/Chainsaw_%28Scorched_Earth%29.png/revision/latest?cb=20160902000228", ""),
    )

    private val structures = listOf(
        Crafting("Campfire", "Cooking", "100", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/0/01/Campfire.png/revision/latest?cb=20150615094850", ""),
        Crafting("Cannon", "Emplacement", "5,000", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/a/a6/Cannon.png/revision/latest?cb=20160428045724", ""),
        Crafting("Simple Bed", "Structure", "10,00", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/b/b1/Simple_Bed.png/revision/latest?cb=20150615115410", ""),
        Crafting("Toilet", "Structure", "500", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/d/d5/Toilet.png/revision/latest?cb=20170530165947", ""),
        Crafting("Wooden Raft", "Vehicle", "20,000", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/d/d8/Wooden_Raft.png/revision/latest?cb=20150923024922", ""),
    )

    private val weapons = listOf(
        Crafting("Spear", "Melee", "3.5% chance to break\non attack", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/4/4f/Spear.png/revision/latest?cb=20150615120731", ""),
        Crafting("Wooden Club", "Melee", "40", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/c/c8/Wooden_Club.png/revision/latest?cb=20151003050839", ""),
        Crafting("Sword", "Melee", "70", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/8/89/Sword.png/revision/latest?cb=20151107061415", ""),
        Crafting("Wooden Shield", "Shield", "250", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/6/61/Wooden_Shield.png/revision/latest?cb=20151106001152", ""),
        Crafting("Bola", "Ranged", "Single use", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/a/ae/Bola.png/revision/latest?cb=20160509071636", ""),
        Crafting("Bow", "Bow", "50", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/6/65/Bow.png/revision/latest?cb=20150615094550", ""),
        Crafting("Assault Rifle", "Gun", "40", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/e/e0/Assault_Rifle.png/revision/latest?cb=20150615094409", ""),
    )
}