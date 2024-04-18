package com.example.arkwiki.craft

data class Crafting(
    val name: String,
    val style: String,
    val durability: String,
    val image: String,
    val ingredients: List<Ingredient>
)

data class Ingredient(
    val name: String,
    val amount: Int,
    val image: String,
)

val clothing = listOf(
    Crafting("Cloth Hat", "Cloth", "25", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/4/42/Cloth_Hat.png/revision/latest?cb=20200518133005", listOf(
        Ingredient("Fiber", 10, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/4/45/Fiber.png/revision/latest?cb=20200518133132")
    )),
    Crafting("Cloth Shirt", "Cloth", "25", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/f/f0/Cloth_Shirt.png/revision/latest?cb=20200518133025", listOf(
        Ingredient("Fiber", 40, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/4/45/Fiber.png/revision/latest?cb=20200518133132")
    )),
    Crafting("Cloth Pants", "Cloth", "25", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/6/69/Cloth_Pants.png/revision/latest?cb=20200518133049", listOf(
        Ingredient("Fiber", 50, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/4/45/Fiber.png/revision/latest?cb=20200518133132")
    )),
    Crafting("Cloth Boots", "Cloth", "25", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/3/36/Cloth_Boots.png/revision/latest?cb=20200518133122", listOf(
        Ingredient("Fiber", 25, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/4/45/Fiber.png/revision/latest?cb=20200518133132"),
        Ingredient("Hide", 6, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/9/96/Hide.png/revision/latest?cb=20150615102457")
    )),
    Crafting("Cloth Gloves", "Cloth", "25", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/9/9e/Cloth_Gloves.png/revision/latest?cb=20200518133039", listOf(
        Ingredient("Fiber", 20, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/4/45/Fiber.png/revision/latest?cb=20200518133132"),
        Ingredient("Hide", 4, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/9/96/Hide.png/revision/latest?cb=20150615102457")
    )),
    Crafting("Fur Cap", "Fur", "120", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/f/fe/Fur_Cap.png/revision/latest?cb=20150927232204", listOf(
        Ingredient("Pelt/Hair/Wool", 56, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/4/45/Pelt.png/revision/latest?cb=20150929052115"),
        Ingredient("Metal Ingot", 10, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/3/37/Metal_Ingot.png/revision/latest?cb=20150615125857"),
        Ingredient("Hide", 7, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/9/96/Hide.png/revision/latest?cb=20150615102457"),
        Ingredient("Fiber", 3, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/4/45/Fiber.png/revision/latest?cb=20200518133132")
    )),
    Crafting("Fur Chestpiece", "Fur", "120", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/b/b3/Fur_Chestpiece.png/revision/latest?cb=20150927232320", listOf(
        Ingredient("Pelt/Hair/Wool", 80, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/4/45/Pelt.png/revision/latest?cb=20150929052115"),
        Ingredient("Metal Ingot", 13, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/3/37/Metal_Ingot.png/revision/latest?cb=20150615125857"),
        Ingredient("Hide", 10, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/9/96/Hide.png/revision/latest?cb=20150615102457"),
        Ingredient("Fiber", 4, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/4/45/Fiber.png/revision/latest?cb=20200518133132")
    )),
    Crafting("Fur Leggings", "Fur", "120", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/9/9c/Fur_Leggings.png/revision/latest?cb=20150927232246", listOf(
        Ingredient("Pelt/Hair/Wool", 96, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/4/45/Pelt.png/revision/latest?cb=20150929052115"),
        Ingredient("Metal Ingot", 16, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/3/37/Metal_Ingot.png/revision/latest?cb=20150615125857"),
        Ingredient("Hide", 12, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/9/96/Hide.png/revision/latest?cb=20150615102457"),
        Ingredient("Fiber", 5, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/4/45/Fiber.png/revision/latest?cb=20200518133132")
    )),
    Crafting("Fur Boots", "Fur", "120", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/6/63/Fur_Boots.png/revision/latest?cb=20150927232047", listOf(
        Ingredient("Pelt/Hair/Wool", 48, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/4/45/Pelt.png/revision/latest?cb=20150929052115"),
        Ingredient("Metal Ingot", 8, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/3/37/Metal_Ingot.png/revision/latest?cb=20150615125857"),
        Ingredient("Hide", 6, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/9/96/Hide.png/revision/latest?cb=20150615102457"),
        Ingredient("Fiber", 4, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/4/45/Fiber.png/revision/latest?cb=20200518133132")
    )),
    Crafting("Fur Gauntlets", "Fur", "120", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/c/c5/Fur_Gauntlets.png/revision/latest?cb=20150927232129", listOf(
        Ingredient("Pelt/Hair/Wool", 40, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/4/45/Pelt.png/revision/latest?cb=20150929052115"),
        Ingredient("Metal Ingot", 6, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/3/37/Metal_Ingot.png/revision/latest?cb=20150615125857"),
        Ingredient("Hide", 5, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/9/96/Hide.png/revision/latest?cb=20150615102457"),
        Ingredient("Fiber", 2, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/4/45/Fiber.png/revision/latest?cb=20200518133132")
    )),
)

val tools = listOf(
    Crafting("Stone Pick", "Tool", "40", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/1/16/Stone_Pick.png/revision/latest?cb=20150615120311", listOf(
        Ingredient("Wood", 1, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/d/d4/Stone.png/revision/latest?cb=20150615120930"),
        Ingredient("Stone", 1, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/d/df/Wood.png/revision/latest?cb=20150615130549"),
        Ingredient("Thatch", 10, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/5/51/Thatch.png/revision/latest?cb=20150615130514")
    )),
    Crafting("Stone Hatchet", "Tool", "40", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/d/d6/Stone_Hatchet.png/revision/latest?cb=20150615120258", listOf(
        Ingredient("Thatch", 10, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/5/51/Thatch.png/revision/latest?cb=20150615130514"),
        Ingredient("Flint", 1, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/2/2e/Flint.png/revision/latest?cb=20150615101007"),
        Ingredient("Wood", 1, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/d/d4/Stone.png/revision/latest?cb=20150615120930"),
    )),
    Crafting("Torch", "Melee", "40", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/b/b2/Torch.png/revision/latest?cb=20150615120234", listOf(
        Ingredient("Flint", 1, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/2/2e/Flint.png/revision/latest?cb=20150615101007"),
        Ingredient("Wood", 1, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/d/d4/Stone.png/revision/latest?cb=20150615120930"),
        Ingredient("Stone", 1, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/d/df/Wood.png/revision/latest?cb=20150615130549"),
    )),
    Crafting("Chainsaw", "Tool", "80", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/5/5f/Chainsaw_%28Scorched_Earth%29.png/revision/latest?cb=20160902000228", listOf(
        Ingredient("Polymer", 75, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/8/81/Polymer.png/revision/latest?cb=20150615130200"),
        Ingredient("Cementing Paste", 50, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/0/03/Cementing_Paste.png/revision/latest?cb=20180801020251"),
        Ingredient("Metal Ingot", 50, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/3/37/Metal_Ingot.png/revision/latest?cb=20150615125857"),
        Ingredient("Electronics", 25, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/d/dd/Electronics.png/revision/latest?cb=20150615100650")
    )),
)

val structures = listOf(
    Crafting("Campfire", "Cooking", "100", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/0/01/Campfire.png/revision/latest?cb=20150615094850", listOf(
        Ingredient("Thatch", 12, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/5/51/Thatch.png/revision/latest?cb=20150615130514"),
        Ingredient("Flint", 1, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/2/2e/Flint.png/revision/latest?cb=20150615101007"),
        Ingredient("Stone", 16, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/d/df/Wood.png/revision/latest?cb=20150615130549"),
        Ingredient("Wood", 2, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/d/d4/Stone.png/revision/latest?cb=20150615120930"),
    )),
    Crafting("Cannon", "Emplacement", "5,000", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/a/a6/Cannon.png/revision/latest?cb=20160428045724", listOf(
        Ingredient("Metal Ingot", 950, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/3/37/Metal_Ingot.png/revision/latest?cb=20150615125857"),
        Ingredient("Fiber", 200, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/4/45/Fiber.png/revision/latest?cb=20200518133132"),
        Ingredient("Hide", 150, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/9/96/Hide.png/revision/latest?cb=20150615102457"),
        Ingredient("Thatch", 120, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/5/51/Thatch.png/revision/latest?cb=20150615130514"),
        Ingredient("Cementing Paste", 300, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/0/03/Cementing_Paste.png/revision/latest?cb=20180801020251"),
    )),
    Crafting("Simple Bed", "Structure", "10,00", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/b/b1/Simple_Bed.png/revision/latest?cb=20150615115410", listOf(
        Ingredient("Wood", 15, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/d/d4/Stone.png/revision/latest?cb=20150615120930"),
        Ingredient("Thatch", 80, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/5/51/Thatch.png/revision/latest?cb=20150615130514"),
        Ingredient("Fiber", 30, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/4/45/Fiber.png/revision/latest?cb=20200518133132"),
        Ingredient("Hide", 40, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/9/96/Hide.png/revision/latest?cb=20150615102457"),
    )),
    Crafting("Toilet", "Structure", "500", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/d/d5/Toilet.png/revision/latest?cb=20170530165947", listOf(
        Ingredient("Stone", 30, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/d/df/Wood.png/revision/latest?cb=20150615130549"),
        Ingredient("Wood", 70, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/d/d4/Stone.png/revision/latest?cb=20150615120930"),
        Ingredient("Metal", 180, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/e/e1/Metal.png/revision/latest?cb=20150615123338"),
        Ingredient("Cementing Paste", 200, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/0/03/Cementing_Paste.png/revision/latest?cb=20180801020251"),
        Ingredient("Crystal", 40, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/3/31/Crystal.png/revision/latest?cb=20150618193219"),
    )),
    Crafting("Wooden Raft", "Vehicle", "20,000", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/d/d8/Wooden_Raft.png/revision/latest?cb=20150923024922", listOf(
        Ingredient("Wood", 250, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/d/d4/Stone.png/revision/latest?cb=20150615120930"),
        Ingredient("Fiber", 125, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/4/45/Fiber.png/revision/latest?cb=20200518133132"),
        Ingredient("Hide", 75, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/9/96/Hide.png/revision/latest?cb=20150615102457"),
    )),
)

val weapons = listOf(
    Crafting("Spear", "Melee", "3.5% chance to break\non attack", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/4/4f/Spear.png/revision/latest?cb=20150615120731", listOf(
        Ingredient("Flint", 2, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/2/2e/Flint.png/revision/latest?cb=20150615101007"),
        Ingredient("Wood", 8, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/d/d4/Stone.png/revision/latest?cb=20150615120930"),
        Ingredient("Fiber", 12, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/4/45/Fiber.png/revision/latest?cb=20200518133132"),
    )),
    Crafting("Wooden Club", "Melee", "40", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/c/c8/Wooden_Club.png/revision/latest?cb=20151003050839", listOf(
        Ingredient("Wood", 4, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/d/d4/Stone.png/revision/latest?cb=20150615120930"),
        Ingredient("Fiber", 15, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/4/45/Fiber.png/revision/latest?cb=20200518133132"),
    )),
    Crafting("Sword", "Melee", "70", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/8/89/Sword.png/revision/latest?cb=20151107061415", listOf(
        Ingredient("Metal Ingot", 50, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/3/37/Metal_Ingot.png/revision/latest?cb=20150615125857"),
        Ingredient("Wood", 1, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/d/d4/Stone.png/revision/latest?cb=20150615120930"),
        Ingredient("Hide", 15, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/9/96/Hide.png/revision/latest?cb=20150615102457"),
    )),
    Crafting("Wooden Shield", "Shield", "250", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/6/61/Wooden_Shield.png/revision/latest?cb=20151106001152", listOf(
        Ingredient("Wood", 40, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/d/d4/Stone.png/revision/latest?cb=20150615120930"),
        Ingredient("Fiber", 15, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/4/45/Fiber.png/revision/latest?cb=20200518133132"),
        Ingredient("Hide", 12, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/9/96/Hide.png/revision/latest?cb=20150615102457"),
    )),
    Crafting("Bola", "Ranged", "Single use", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/a/ae/Bola.png/revision/latest?cb=20160509071636", listOf(
        Ingredient("Thatch", 10, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/5/51/Thatch.png/revision/latest?cb=20150615130514"),
        Ingredient("Stone", 3, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/d/df/Wood.png/revision/latest?cb=20150615130549"),
        Ingredient("Fiber", 15, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/4/45/Fiber.png/revision/latest?cb=20200518133132"),
        Ingredient("Hide", 3, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/9/96/Hide.png/revision/latest?cb=20150615102457"),
    )),
    Crafting("Bow", "Bow", "50", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/6/65/Bow.png/revision/latest?cb=20150615094550", listOf(
        Ingredient("Wood", 15, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/d/d4/Stone.png/revision/latest?cb=20150615120930"),
        Ingredient("Fiber", 50, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/4/45/Fiber.png/revision/latest?cb=20200518133132"),
    )),
    Crafting("Assault Rifle", "Gun", "40", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/e/e0/Assault_Rifle.png/revision/latest?cb=20150615094409", listOf(
        Ingredient("Polymer", 60, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/8/81/Polymer.png/revision/latest?cb=20150615130200"),
        Ingredient("Cementing Paste", 35, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/0/03/Cementing_Paste.png/revision/latest?cb=20180801020251"),
        Ingredient("Metal Ingot", 50, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/3/37/Metal_Ingot.png/revision/latest?cb=20150615125857"),
    )),
)