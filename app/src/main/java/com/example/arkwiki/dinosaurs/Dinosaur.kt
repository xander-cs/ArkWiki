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

val dinosaurs = listOf(
    Dinosaur("Acrocanthosaurus", Diet.CARNIVORE, "Aggressive", "Raw Mutton", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/c/ce/Mod_ARK_Additions_Acrocanthosaurus_image_3.jpg/revision/latest/scale-to-width-down/1000?cb=20200409194205", "", emptyList()),
    Dinosaur("Allosaurus", Diet.CARNIVORE, "Aggressive", "Raw Mutton", "https://www.dododex.com/media/creature/allosaurus.png", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/3/35/S_allosaurus_startled.OGG/revision/latest?cb=20161129154952", listOf(Type.ISLAND, Type.CENTER, Type.NORSE, Type.CORRUPTED, Type.GRAND, Type.CRYSTALLINE, Type.COLONY, Type.LOST)),
    Dinosaur("Ankylosaurus", Diet.HERBIVORE, "Docile", "Crops","https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/f/f2/Render_Ankylosaurus.png/revision/latest/scale-to-width-down/1000?cb=20150915100355s", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/0/0c/Ankylosound.ogg/revision/latest?cb=20180403204546",  listOf(Type.ISLAND, Type.CENTER, Type.DESERT, Type.NORSE, Type.CORRUPTED, Type.GRAND, Type.SIMULATION, Type.CRYSTALLINE, Type.COLONY, Type.LOST)),
    Dinosaur("Baryonyx", Diet.PISCIVORE, "Territorial", "Raw Prime Fish Meat", "https://www.dododex.com/media/creature/baryonyx.png", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/3/3a/Baryonyxsound.ogg/revision/latest?cb=20180403205301", listOf(Type.ISLAND, Type.CENTER, Type.NORSE, Type.CORRUPTED, Type.GRAND, Type.CRYSTALLINE, Type.COLONY, Type.LOST)),
    Dinosaur("Brontosaurus", Diet.HERBIVORE, "Docile", "Mejoberry", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/f/f4/Render_Brontosaurus.png/revision/latest/scale-to-width-down/1000?cb=20150915100642", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/7/7e/Brontosound.ogg/revision/latest?cb=20180403205552", listOf(Type.ISLAND, Type.CENTER, Type.NORSE, Type.CORRUPTED, Type.GRAND, Type.SIMULATION, Type.CRYSTALLINE, Type.COLONY, Type.LOST)),
    Dinosaur("Carcharodontosaurus", Diet.CARNIVORE, "Aggressive", "N/A", "https://www.dododex.com/media/creature/carcharodontosaurus.png", "", emptyList()),
    Dinosaur("Carnotaurus", Diet.CARNIVORE, "Aggressive", "Raw Mutton", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/8/89/Render_Carno.png/revision/latest/scale-to-width-down/1000?cb=20150915100742", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/4/4d/Carnosound.ogg/revision/latest?cb=20180403205908", listOf(Type.ISLAND, Type.CENTER, Type.DESERT, Type.NORSE, Type.CORRUPTED, Type.GRAND, Type.SIMULATION, Type.CRYSTALLINE, Type.COLONY , Type.LOST)),
    Dinosaur("Compy", Diet.CARNIVORE, "Curious", "Raw Mutton", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/3/3a/Compsognathus_Large.png/revision/latest/scale-to-width-down/1000?cb=20150614135706", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/0/07/Compy_chortle.OGG/revision/latest?cb=20161106233727", listOf(Type.ISLAND, Type.CENTER, Type.NORSE, Type.CORRUPTED, Type.GRAND, Type.CRYSTALLINE, Type.COLONY, Type.LOST)),
    Dinosaur("Deinonychus", Diet.CARNIVORE, "Aggressive", "Kibble", "https://www.dododex.com/media/creature/deinonychus.png", "", listOf(Type.GRAND)),
    Dinosaur("Dilophosaur", Diet.CARNIVORE, "Territorial", "Raw Mutton", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/d/d2/Render_Dilo.png/revision/latest/scale-to-width-down/1000?cb=20151102102401", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/b/bb/Dilosound.ogg/revision/latest?cb=20180403210611", listOf(Type.ISLAND, Type.CENTER, Type.NORSE, Type.CORRUPTED, Type.GRAND, Type.SIMULATION, Type.CRYSTALLINE, Type.COLONY, Type.LOST)),
    Dinosaur("Diplodocus", Diet.HERBIVORE, "Naive", "Crops", "https://www.dododex.com/media/creature/diplodocus.png", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/2/24/Diplodocussound.ogg/revision/latest?cb=20180403211100", listOf(Type.ISLAND, Type.CENTER, Type.NORSE, Type.CORRUPTED, Type.GRAND, Type.CRYSTALLINE, Type.COLONY, Type.LOST)),
    Dinosaur("Gallimimus", Diet.HERBIVORE, "Skittish", "Crops", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/1/1d/Gallimimus.jpg/revision/latest/scale-to-width-down/1000?cb=20150617005245", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/2/24/Gallimimus_Roar_1.OGG/revision/latest?cb=20160206002756", listOf(Type.ISLAND, Type.CENTER, Type.DESERT, Type.NORSE, Type.CORRUPTED, Type.GRAND, Type.SIMULATION, Type.CRYSTALLINE, Type.COLONY, Type.LOST)),
    Dinosaur("Giganotosaurus", Diet.CARNIVORE, "Angry", "Raw Mutton", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/d/d5/Giganotosaurus_Transparent.png/revision/latest/scale-to-width-down/1000?cb=20160303153658", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/d/d6/Gigasound.ogg/revision/latest?cb=20180403211602", listOf(Type.ISLAND, Type.CENTER, Type.NORSE, Type.CORRUPTED, Type.GRAND, Type.CRYSTALLINE, Type.COLONY, Type.LOST)),
    Dinosaur("Iguanodon", Diet.HERBIVORE, "Reactive", "Crops", "https://www.dododex.com/media/creature/iguanodon.png", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/5/5a/Iguanodon_sound.ogg/revision/latest?cb=20170731114407", listOf(Type.ISLAND, Type.CENTER, Type.DESERT, Type.NORSE, Type.CORRUPTED, Type.GRAND, Type.SIMULATION, Type.CRYSTALLINE, Type.COLONY, Type.LOST)),
    Dinosaur("Kentrosaurus", Diet.HERBIVORE, "Short-Tempered", "Crops", "https://www.dododex.com/media/creature/kentrosaurus.png", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/0/08/Kentrosound.ogg/revision/latest?cb=20180403212330", listOf(Type.ISLAND, Type.CENTER, Type.DESERT, Type.NORSE, Type.CORRUPTED, Type.GRAND, Type.SIMULATION, Type.CRYSTALLINE, Type.COLONY, Type.LOST)),
    Dinosaur("Megaloraurus", Diet.CARNIVORE, "Nocturnally Aggressive", "Raw Mutton", "https://www.dododex.com/media/creature/megalosaurus.png", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/9/9b/Megalosaurussound.ogg/revision/latest?cb=20180403212922", listOf(Type.ISLAND, Type.CENTER, Type.DESERT, Type.NORSE, Type.CORRUPTED, Type.CRYSTALLINE, Type.LOST)),
    Dinosaur("Microraptor", Diet.CARNIVORE, "Aggressive", "Rare Flower", "https://www.dododex.com/media/creature/microraptor.png", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/2/29/Microraptorsound.ogg/revision/latest?cb=20180403213115", listOf(Type.ISLAND, Type.CENTER, Type.DESERT, Type.NORSE, Type.CORRUPTED, Type.GRAND, Type.SIMULATION, Type.CRYSTALLINE, Type.COLONY, Type.LOST)),
    Dinosaur("Oviraptor", Diet.CARNIVORE, "Skittish", "Giganotosaurus Egg", "https://www.dododex.com/media/creature/oviraptor.png", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/5/50/Oviraptor_Startled_3.OGG/revision/latest?cb=20160206003309", listOf(Type.ISLAND, Type.CENTER, Type.NORSE, Type.CORRUPTED, Type.GRAND, Type.SIMULATION, Type.CRYSTALLINE, Type.COLONY, Type.LOST)),
    Dinosaur("Pachy", Diet.HERBIVORE, "Docile", "Crops", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/8/87/Pachycephalosaurus.jpg/revision/latest/scale-to-width-down/1000?cb=20150616011607", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/8/88/Pachysound.ogg/revision/latest?cb=20180403213340", listOf(Type.ISLAND, Type.CENTER, Type.NORSE, Type.CORRUPTED, Type.GRAND, Type.CRYSTALLINE, Type.COLONY, Type.LOST)),
    Dinosaur("Pachyrhinosaurus", Diet.HERBIVORE, "Evasive", "Bug Repellant", "https://www.dododex.com/media/creature/pachyrhinosaurus.png", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/6/66/S_pachyrhino_idle_02.OGG/revision/latest?cb=20161129154123", listOf(Type.ISLAND, Type.CENTER, Type.NORSE, Type.CORRUPTED, Type.GRAND, Type.SIMULATION, Type.CRYSTALLINE, Type.COLONY, Type.LOST)),
    Dinosaur("Parasaur", Diet.HERBIVORE, "Skittish", "Crops", "https://www.dododex.com/media/creature/parasaur.png", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/b/bf/Parasaursound.ogg/revision/latest?cb=20180403213555", listOf(Type.ISLAND, Type.CENTER, Type.DESERT, Type.NORSE, Type.CORRUPTED, Type.GRAND, Type.SIMULATION, Type.CRYSTALLINE, Type.COLONY, Type.LOST)),
    Dinosaur("Pegomastax", Diet.HERBIVORE, "Aggressive", "Mejoberry", "https://www.dododex.com/media/creature/pegomastax.png", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/1/15/Pegomastaxsound.ogg/revision/latest?cb=20180403213701", listOf(Type.ISLAND, Type.CENTER, Type.DESERT, Type.NORSE, Type.GRAND, Type.SIMULATION, Type.CRYSTALLINE, Type.COLONY, Type.LOST)),
    Dinosaur("Raptor", Diet.CARNIVORE, "Aggressive", "Raw Mutton", "https://www.dododex.com/media/creature/raptor.png", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/4/46/Raptorsound3.ogg/revision/latest?cb=20180801193254", listOf(Type.ISLAND, Type.CENTER, Type.DESERT, Type.NORSE, Type.CORRUPTED, Type.GRAND, Type.CRYSTALLINE, Type.COLONY, Type.LOST)),
    Dinosaur("Rex", Diet.CARNIVORE, "Aggressive", "Raw Mutton", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/a/a3/Render_Tyrannosaurus.png/revision/latest/scale-to-width-down/1000?cb=20150915101037", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/9/97/Rexsound.ogg/revision/latest?cb=20180403214649", listOf(Type.ISLAND, Type.CENTER, Type.DESERT, Type.NORSE, Type.CORRUPTED, Type.GRAND, Type.CRYSTALLINE, Type.COLONY, Type.LOST)),
    Dinosaur("Spino", Diet.CARNIVORE, "Territorial", "Raw Prime Fish Meat", "https://www.dododex.com/media/creature/spinosaur.png", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/b/b8/Spinosound.ogg/revision/latest?cb=20180801193016", listOf(Type.ISLAND, Type.CENTER, Type.NORSE, Type.CORRUPTED, Type.GRAND, Type.CRYSTALLINE, Type.COLONY, Type.LOST)),
    Dinosaur("Stegosaurus", Diet.HERBIVORE, "Docile", "Mejoberry", "https://www.dododex.com/media/creature/stegosaurus.png", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/b/bc/PW_stego_voc_mumble_01.OGG/revision/latest?cb=20150704192009", listOf(Type.ISLAND, Type.CENTER, Type.NORSE, Type.CORRUPTED, Type.GRAND, Type.SIMULATION, Type.CRYSTALLINE, Type.COLONY, Type.LOST)),
    Dinosaur("Therizinosaurus", Diet.HERBIVORE, "Territorial", "Mejoberry", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/9/9e/Therizinosaurus_large.png/revision/latest?cb=20150801152601", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/b/b5/Therizinosound.ogg/revision/latest?cb=20180403215229", listOf(Type.ISLAND, Type.CENTER, Type.NORSE, Type.CORRUPTED, Type.GRAND, Type.SIMULATION, Type.CRYSTALLINE, Type.COLONY, Type.LOST)),
    Dinosaur("Titanosaur", Diet.HERBIVORE, "Docile", "N/A", "https://www.dododex.com/media/creature/titanosaur.png", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/b/b7/Titanosaursound.ogg/revision/latest?cb=20180403215454", listOf(Type.ISLAND, Type.CENTER, Type.DESERT, Type.NORSE, Type.CRYSTALLINE, Type.LOST)),
    Dinosaur("Triceratops", Diet.HERBIVORE, "Docile", "Mejoberry", "https://www.dododex.com/media/creature/triceratops.png", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/a/a6/PW_trike_voc_mumble_01.OGG/revision/latest?cb=20150704192205", listOf(Type.ISLAND, Type.CENTER, Type.NORSE, Type.CORRUPTED, Type.GRAND, Type.CRYSTALLINE, Type.COLONY, Type.LOST)),
    Dinosaur("Troodon", Diet.CARNIVORE, "Nocturnally Aggressive", "Live Creatures", "https://www.dododex.com/media/creature/troodon.png", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/5/5f/Troodonsound.ogg/revision/latest?cb=20180403215555", listOf(Type.ISLAND, Type.CENTER, Type.DESERT, Type.NORSE, Type.CORRUPTED, Type.GRAND, Type.CRYSTALLINE, Type.COLONY, Type.LOST)),
    Dinosaur("Yutyrannus", Diet.CARNIVORE, "Aggressive", "Raw Mutton", "https://www.dododex.com/media/creature/yutyrannus.png", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/0/02/Yutyrannussound.ogg/revision/latest?cb=20180403215848", listOf(Type.ISLAND, Type.CENTER, Type.DESERT, Type.NORSE, Type.CORRUPTED, Type.GRAND, Type.CRYSTALLINE, Type.COLONY, Type.LOST)),

)