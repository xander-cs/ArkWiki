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
    val tamingMethod: String,
    val preferredFood: String,
    val image: String,
    val roar: String,
    val types: List<Type>,
)

val dinosaurs = listOf(
    Dinosaur("Baryonyx", Diet.PISCIVORE, "Territorial", "Knockout", "Raw Prime Fish Meat", "https://www.dododex.com/media/creature/baryonyx.png", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/3/3a/Baryonyxsound.ogg/revision/latest?cb=20180403205301", listOf(Type.ISLAND, Type.CENTER, Type.NORSE, Type.CORRUPTED, Type.GRAND, Type.CRYSTALLINE, Type.COLONY, Type.LOST)),
    Dinosaur("Carnotaurus", Diet.CARNIVORE, "Aggressive", "Knockout", "Raw Mutton", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/8/89/Render_Carno.png/revision/latest/scale-to-width-down/1000?cb=20150915100742", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/4/4d/Carnosound.ogg/revision/latest?cb=20180403205908", listOf(Type.ISLAND, Type.CENTER, Type.DESERT, Type.NORSE, Type.CORRUPTED, Type.GRAND, Type.SIMULATION, Type.CRYSTALLINE, Type.COLONY , Type.LOST)),
    Dinosaur("Rex", Diet.CARNIVORE, "Aggressive", "Knockout", "Raw Mutton", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/a/a3/Render_Tyrannosaurus.png/revision/latest/scale-to-width-down/1000?cb=20150915101037", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/9/97/Rexsound.ogg/revision/latest?cb=20180403214649", listOf(Type.ISLAND, Type.CENTER, Type.DESERT, Type.NORSE, Type.CORRUPTED, Type.GRAND, Type.CRYSTALLINE, Type.COLONY, Type.LOST)),
    Dinosaur("Spino", Diet.CARNIVORE, "Territorial", "Knockout", "Raw Prime Fish Meat", "https://www.dododex.com/media/creature/spinosaur.png", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/b/b8/Spinosound.ogg/revision/latest?cb=20180801193016", listOf(Type.ISLAND, Type.CENTER, Type.NORSE, Type.CORRUPTED, Type.GRAND, Type.CRYSTALLINE, Type.COLONY, Type.LOST)),
    Dinosaur("Stegosaurus", Diet.HERBIVORE, "Docile", "Knockout", "Mejoberry", "https://www.dododex.com/media/creature/stegosaurus.png", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/b/bc/PW_stego_voc_mumble_01.OGG/revision/latest?cb=20150704192009", listOf(Type.ISLAND, Type.CENTER, Type.NORSE, Type.CORRUPTED, Type.GRAND, Type.SIMULATION, Type.CRYSTALLINE, Type.COLONY, Type.LOST)),
)