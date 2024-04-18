package com.example.arkwiki.dinosaurs

enum class Type {
    ISLAND,
    DESERT,
    UNDERGROUND,
    CORRUPTED,
    SIMULATION,
    COLONY,
    CENTER,
    NORSE,
    GRAND,
    CRYSTALLINE,
    LOST,
}

enum class Diet {
    CARNIVORE,
    HERBIVORE,
    PISCIVORE,;

    override fun toString(): String {
        return super.toString().lowercase().replaceFirstChar(Char::titlecase)
    }
}

data class Dinosaur(
    val name: String,
    val diet: Diet,
    val temperament: String,
    val preferredFood: String,
    val image: String,
    val roar: String,
    val types: List<Type>,
)