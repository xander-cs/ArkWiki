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

data class Dinosaur(
    val name: String,
    val diet: String,
    val temperament: String,
    val image: String,
    val types: List<Type>,
)

val dinosaurs = listOf(
    Dinosaur("Carnotaurus", "Carnivore", "Aggressive", "", listOf(Type.ISLAND, Type.CENTER, Type.DESERT, Type.NORSE, Type.CORRUPTED, Type.GRAND, Type.SIMULATION, Type.CRYSTALLINE, Type.COLONY , Type.LOST)),
    Dinosaur("Rex", "Carnivore", "Aggressive", "", listOf(Type.ISLAND, Type.CENTER, Type.DESERT, Type.NORSE, Type.CORRUPTED, Type.GRAND, Type.CRYSTALLINE, Type.COLONY, Type.LOST)),
    Dinosaur("Spino", "Carnivore", "Territorial", "", listOf(Type.ISLAND, Type.CENTER, Type.NORSE, Type.CORRUPTED, Type.GRAND, Type.CRYSTALLINE, Type.COLONY, Type.LOST)),
    Dinosaur("Stegosaurus", "Herbivore", "Docile", "", listOf(Type.ISLAND, Type.CENTER, Type.NORSE, Type.CORRUPTED, Type.GRAND, Type.SIMULATION, Type.CRYSTALLINE, Type.COLONY, Type.LOST)),
)