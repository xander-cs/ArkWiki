package com.example.arkwiki.craft

data class Crafting(
    val name: String,
    val style: String,
    val durability: String,
    val image: String,
    val ingredients: String
)

data class Ingredient(
    val name: String,
    val amount: Int,
    val image: String,
)