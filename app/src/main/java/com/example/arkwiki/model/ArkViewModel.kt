package com.example.arkwiki.model

import com.example.arkwiki.Card
import com.example.arkwiki.craft.Crafting
import com.example.arkwiki.craft.Ingredient
import com.example.arkwiki.dinosaurs.Diet
import com.example.arkwiki.dinosaurs.Dinosaur
import com.example.arkwiki.dinosaurs.Type

class ArkViewModel {
    /*
    * MAIN CATEGORIES
    * */

    val categories = listOf(
        Card("Breeding", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/a/a3/Eggs.png/revision/latest?cb=20200807154254"),
        Card("Crafting", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/b/b9/Smithy.png/revision/latest?cb=20150615134739"),
        Card("Dinosaurs", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/8/8d/Alpha_T-Rex.png/revision/latest?cb=20190228120718"),
        Card("Taming", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/c/cc/Box_o%27_Chocolates.png/revision/latest?cb=20160228212112"),
    )


    /*
    * CRAFTING
    * */
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

        Crafting("Ghillie Mask", "Utility", "60", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/f/f2/Ghillie_Mask.png/revision/latest?cb=20160107050927", listOf(
            Ingredient("Organic Polymer", 5, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/1/13/Organic_Polymer.png/revision/latest?cb=20160424034337"),
            Ingredient("Hide", 7, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/9/96/Hide.png/revision/latest?cb=20150615102457"),
            Ingredient("Fiber", 3, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/4/45/Fiber.png/revision/latest?cb=20200518133132"),
        )),
        Crafting("Ghillie Chestpiece", "Utility", "60", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/8/8b/Ghillie_Chestpiece.png/revision/latest?cb=20160107050903", listOf(
            Ingredient("Organic Polymer", 6, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/1/13/Organic_Polymer.png/revision/latest?cb=20160424034337"),
            Ingredient("Hide", 10, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/9/96/Hide.png/revision/latest?cb=20150615102457"),
            Ingredient("Fiber", 4, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/4/45/Fiber.png/revision/latest?cb=20200518133132"),
        )),
        Crafting("Ghillie Leggings", "Utility", "60", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/1/1a/Ghillie_Leggings.png/revision/latest?cb=20160107050940", listOf(
            Ingredient("Organic Polymer", 8, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/1/13/Organic_Polymer.png/revision/latest?cb=20160424034337"),
            Ingredient("Hide", 12, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/9/96/Hide.png/revision/latest?cb=20150615102457"),
            Ingredient("Fiber", 5, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/4/45/Fiber.png/revision/latest?cb=20200518133132"),
        )),
        Crafting("Ghillie Boots", "Utility", "60", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/9/9b/Ghillie_Boots.png/revision/latest?cb=20160107050915", listOf(
            Ingredient("Organic Polymer", 4, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/1/13/Organic_Polymer.png/revision/latest?cb=20160424034337"),
            Ingredient("Hide", 6, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/9/96/Hide.png/revision/latest?cb=20150615102457"),
            Ingredient("Fiber", 4, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/4/45/Fiber.png/revision/latest?cb=20200518133132"),
        )),
        Crafting("Ghillie Gauntlets", "Utility", "60", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/b/bf/Ghillie_Gauntlets.png/revision/latest?cb=20160107050854", listOf(
            Ingredient("Organic Polymer", 3, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/1/13/Organic_Polymer.png/revision/latest?cb=20160424034337"),
            Ingredient("Hide", 5, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/9/96/Hide.png/revision/latest?cb=20150615102457"),
            Ingredient("Fiber", 2, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/4/45/Fiber.png/revision/latest?cb=20200518133132"),
        )),
        Crafting("SCUBA Mask", "Utility", "45", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/5/51/SCUBA_Mask.png/revision/latest?cb=20150824110431", listOf(
            Ingredient("Hide", 15, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/9/96/Hide.png/revision/latest?cb=20150615102457"),
            Ingredient("Fiber", 6, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/4/45/Fiber.png/revision/latest?cb=20200518133132"),
            Ingredient("Crystal", 10, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/3/31/Crystal.png/revision/latest?cb=20150618193219"),
            Ingredient("Silica Pearls", 3, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/4/4a/Silica_Pearls.png/revision/latest?cb=20150615130449"),
        )),
        Crafting("SCUBA Tank", "Utility", "45", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/a/a9/SCUBA_Tank.png/revision/latest?cb=20160209203813", listOf(
            Ingredient("Hide", 20, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/9/96/Hide.png/revision/latest?cb=20150615102457"),
            Ingredient("Fiber", 8, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/4/45/Fiber.png/revision/latest?cb=20200518133132"),
            Ingredient("Metal Ingot", 14, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/3/37/Metal_Ingot.png/revision/latest?cb=20150615125857"),
            Ingredient("Organic Polymer", 3, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/1/13/Organic_Polymer.png/revision/latest?cb=20160424034337"),
        )),
        Crafting("SCUBA Leggings", "Utility", "45", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/7/7e/SCUBA_Leggings.png/revision/latest?cb=20150917013157", listOf(
            Ingredient("Hide", 40, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/9/96/Hide.png/revision/latest?cb=20150615102457"),
            Ingredient("Fiber", 4, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/4/45/Fiber.png/revision/latest?cb=20200518133132"),
            Ingredient("Metal Ingot", 2, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/3/37/Metal_Ingot.png/revision/latest?cb=20150615125857"),
            Ingredient("Organic Polymer", 40, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/1/13/Organic_Polymer.png/revision/latest?cb=20160424034337"),
        )),
        Crafting("SCUBA Flippers", "Utility", "45", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/4/42/SCUBA_Flippers.png/revision/latest?cb=20150824110553", listOf(
            Ingredient("Hide", 12, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/9/96/Hide.png/revision/latest?cb=20150615102457"),
            Ingredient("Fiber", 5, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/4/45/Fiber.png/revision/latest?cb=20200518133132"),
            Ingredient("Chitin", 12, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/a/a1/Chitin.png/revision/latest?cb=20150614180439"),
            Ingredient("Cementing Paste", 6, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/0/03/Cementing_Paste.png/revision/latest?cb=20180801020251"),
            Ingredient("Silica Pearls", 4, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/4/4a/Silica_Pearls.png/revision/latest?cb=20150615130449"),
        )),
        Crafting("Flak Helmet", "Armor", "120", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/e/ec/Flak_Helmet.png/revision/latest?cb=20150614181045", listOf(
            Ingredient("Metal Ingot", 10, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/3/37/Metal_Ingot.png/revision/latest?cb=20150615125857"),
            Ingredient("Hide", 7, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/9/96/Hide.png/revision/latest?cb=20150615102457"),
            Ingredient("Fiber", 3, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/4/45/Fiber.png/revision/latest?cb=20200518133132"),
        )),
        Crafting("Flak Chestpiece", "Armor", "120", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/b/bf/Flak_Chestpiece.png/revision/latest?cb=20220414043038", listOf(
            Ingredient("Metal Ingot", 13, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/3/37/Metal_Ingot.png/revision/latest?cb=20150615125857"),
            Ingredient("Hide", 10, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/9/96/Hide.png/revision/latest?cb=20150615102457"),
            Ingredient("Fiber", 4, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/4/45/Fiber.png/revision/latest?cb=20200518133132"),
        )),
        Crafting("Flak Leggings", "Armor", "120", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/0/07/Flak_Leggings.png/revision/latest?cb=20150614180958", listOf(
            Ingredient("Metal Ingot", 16, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/3/37/Metal_Ingot.png/revision/latest?cb=20150615125857"),
            Ingredient("Hide", 12, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/9/96/Hide.png/revision/latest?cb=20150615102457"),
            Ingredient("Fiber", 5, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/4/45/Fiber.png/revision/latest?cb=20200518133132"),
        )),
        Crafting("Flak Boots", "Armor", "120", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/7/77/Flak_Boots.png/revision/latest?cb=20150614181106", listOf(
            Ingredient("Metal Ingot", 8, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/3/37/Metal_Ingot.png/revision/latest?cb=20150615125857"),
            Ingredient("Hide", 6, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/9/96/Hide.png/revision/latest?cb=20150615102457"),
            Ingredient("Fiber", 4, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/4/45/Fiber.png/revision/latest?cb=20200518133132"),
        )),
        Crafting("Flak Gauntlets", "Armor", "120", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/f/f2/Flak_Gauntlets.png/revision/latest?cb=20150614181142", listOf(
            Ingredient("Metal Ingot", 7, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/3/37/Metal_Ingot.png/revision/latest?cb=20150615125857"),
            Ingredient("Hide", 5, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/9/96/Hide.png/revision/latest?cb=20150615102457"),
            Ingredient("Fiber", 2, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/4/45/Fiber.png/revision/latest?cb=20200518133132"),
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

        Crafting("Refining Forge", "Structure", "2,500", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/9/98/Refining_Forge.png/revision/latest?cb=20150615132657", listOf(
            Ingredient("Stone", 125, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/d/df/Wood.png/revision/latest?cb=20150615130549"),
            Ingredient("Flint", 5, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/2/2e/Flint.png/revision/latest?cb=20150615101007"),
            Ingredient("Hide", 65, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/9/96/Hide.png/revision/latest?cb=20150615102457"),
            Ingredient("Wood", 20, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/d/d4/Stone.png/revision/latest?cb=20150615120930"),
            Ingredient("Fiber", 40, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/4/45/Fiber.png/revision/latest?cb=20200518133132"),
        )),
        Crafting("Smithy", "Structure", "1,500", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/b/b9/Smithy.png/revision/latest?cb=20150615134739", listOf(
            Ingredient("Metal Ingot", 5, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/3/37/Metal_Ingot.png/revision/latest?cb=20150615125857"),
            Ingredient("Stone", 50, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/d/df/Wood.png/revision/latest?cb=20150615130549"),
            Ingredient("Wood", 30, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/d/d4/Stone.png/revision/latest?cb=20150615120930"),
            Ingredient("Hide", 20, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/9/96/Hide.png/revision/latest?cb=20150615102457"),
        )),
        Crafting("Mortar and Pestle", "Structure", "1,000", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/f/f0/Mortar_And_Pestle.png/revision/latest?cb=20150615115514", listOf(
            Ingredient("Stone", 65, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/d/df/Wood.png/revision/latest?cb=20150615130549"),
            Ingredient("Hide", 15, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/9/96/Hide.png/revision/latest?cb=20150615102457"),
        )),
        Crafting("Cooking Pot", "Structure", "500", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/f/f9/Cooking_Pot.png/revision/latest?cb=20150615095547", listOf(
            Ingredient("Stone", 75, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/d/df/Wood.png/revision/latest?cb=20150615130549"),
            Ingredient("Thatch", 15, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/5/51/Thatch.png/revision/latest?cb=20150615130514"),
            Ingredient("Wood", 10, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/d/d4/Stone.png/revision/latest?cb=20150615120930"),
            Ingredient("Flint", 5, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/2/2e/Flint.png/revision/latest?cb=20150615101007"),
        )),
        Crafting("Storage Box", "Structure", "500", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/d/d0/Storage_Box.png/revision/latest?cb=20150615115357", listOf(
            Ingredient("Wood", 25, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/d/d4/Stone.png/revision/latest?cb=20150615120930"),
            Ingredient("Thatch", 20, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/5/51/Thatch.png/revision/latest?cb=20150615130514"),
            Ingredient("Fiber", 10, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/4/45/Fiber.png/revision/latest?cb=20200518133132"),
        )),
        Crafting("Training Dummy", "Structure", "400", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/4/49/Training_Dummy.png/revision/latest?cb=20160611103602", listOf(
            Ingredient("Wood", 80, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/d/d4/Stone.png/revision/latest?cb=20150615120930"),
            Ingredient("Fiber", 500, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/4/45/Fiber.png/revision/latest?cb=20200518133132"),
            Ingredient("Hide", 10, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/9/96/Hide.png/revision/latest?cb=20150615102457"),
            Ingredient("Thatch", 500, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/5/51/Thatch.png/revision/latest?cb=20150615130514"),
        )),
        Crafting("Ballista Turret", "Emplacement", "7,000", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/6/65/Ballista_Turret.png/revision/latest?cb=20150922223748", listOf(
            Ingredient("Wood", 500, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/d/d4/Stone.png/revision/latest?cb=20150615120930"),
            Ingredient("Metal Ingot", 300, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/3/37/Metal_Ingot.png/revision/latest?cb=20150615125857"),
            Ingredient("Stone", 250, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/d/df/Wood.png/revision/latest?cb=20150615130549"),
            Ingredient("Fiber", 200, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/4/45/Fiber.png/revision/latest?cb=20200518133132"),
            Ingredient("Thatch", 100, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/5/51/Thatch.png/revision/latest?cb=20150615130514"),
            Ingredient("Hide", 100, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/9/96/Hide.png/revision/latest?cb=20150615102457"),
        )),
        Crafting("Preserving Bin", "Structure", "600", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/0/09/Preserving_Bin.png/revision/latest?cb=20150618195400", listOf(
            Ingredient("Stone", 30, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/d/df/Wood.png/revision/latest?cb=20150615130549"),
            Ingredient("Wood", 30, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/d/d4/Stone.png/revision/latest?cb=20150615120930"),
            Ingredient("Thatch", 10, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/5/51/Thatch.png/revision/latest?cb=20150615130514"),
            Ingredient("Fiber", 20, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/4/45/Fiber.png/revision/latest?cb=20200518133132"),
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
        Crafting("Camera", "Tool", "N/A", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/8/80/Camera.png/revision/latest?cb=20161223220157", listOf(
            Ingredient("Wood", 80, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/d/d4/Stone.png/revision/latest?cb=20150615120930"),
            Ingredient("Hide", 30, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/9/96/Hide.png/revision/latest?cb=20150615102457"),
            Ingredient("Crystal", 240, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/3/31/Crystal.png/revision/latest?cb=20150618193219"),
            Ingredient("Black Pearl", 80, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/4/4c/Black_Pearl.png/revision/latest?cb=20160410175730"),
            Ingredient("Sap", 100, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/7/73/Sap.png/revision/latest?cb=20160706145127"),
            Ingredient("Obsidian", 150, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/2/23/Obsidian.png/revision/latest?cb=20150615125926"),
            Ingredient("Metal Ingot", 140, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/3/37/Metal_Ingot.png/revision/latest?cb=20150615125857"),
        )),

        Crafting("Metal Pick",  "Tool", "40", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/9/9f/Metal_Pick.png/revision/latest?cb=20150615120217", listOf(
            Ingredient("Metal Ingot", 1, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/3/37/Metal_Ingot.png/revision/latest?cb=20150615125857"),
            Ingredient("Wood", 1, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/d/d4/Stone.png/revision/latest?cb=20150615120930"),
            Ingredient("Hide", 10, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/9/96/Hide.png/revision/latest?cb=20150615102457"),
        )),
        Crafting("Metal Hatchet",  "Tool", "40", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/a/a6/Metal_Hatchet.png/revision/latest?cb=20150615120207", listOf(
            Ingredient("Metal Ingot", 8, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/3/37/Metal_Ingot.png/revision/latest?cb=20150615125857"),
            Ingredient("Wood", 1, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/d/d4/Stone.png/revision/latest?cb=20150615120930"),
            Ingredient("Hide", 10, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/9/96/Hide.png/revision/latest?cb=20150615102457"),
        )),
        Crafting("Mining Drill",  "Tool", "700", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/3/30/Mining_Drill_%28Genesis_Part_1%29.png/revision/latest?cb=20200226062838", listOf(
            Ingredient("Organic Polymer", 132, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/1/13/Organic_Polymer.png/revision/latest?cb=20160424034337"),
            Ingredient("Metal Ingot", 482, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/3/37/Metal_Ingot.png/revision/latest?cb=20150615125857"),
            Ingredient("Crystal", 180, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/3/31/Crystal.png/revision/latest?cb=20150618193219"),
            Ingredient("Cementing Paste", 120, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/0/03/Cementing_Paste.png/revision/latest?cb=20180801020251"),
            Ingredient("Black Pearl", 36, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/4/4c/Black_Pearl.png/revision/latest?cb=20160410175730"),
        )),
        Crafting("Fishing Rod",  "Tool", "100", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/c/c7/Fishing_Rod.png/revision/latest?cb=20160728174155", listOf(
            Ingredient("Wood", 12, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/d/d4/Stone.png/revision/latest?cb=20150615120930"),
            Ingredient("Fiber", 50, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/4/45/Fiber.png/revision/latest?cb=20200518133132"),
            Ingredient("Thatch", 20, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/5/51/Thatch.png/revision/latest?cb=20150615130514"),
        )),
        Crafting("Spyglass",  "Tool", "N/A", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/c/c1/Spyglass.png/revision/latest?cb=20150618204128", listOf(
            Ingredient("Wood", 5, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/d/d4/Stone.png/revision/latest?cb=20150615120930"),
            Ingredient("Hide", 10, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/9/96/Hide.png/revision/latest?cb=20150615102457"),
            Ingredient("Fiber", 10, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/4/45/Fiber.png/revision/latest?cb=20200518133132"),
            Ingredient("Crystal", 2, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/3/31/Crystal.png/revision/latest?cb=20150618193219"),
        )),
        Crafting("Compass",  "Tool", "N/A", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/9/92/Compass.png/revision/latest?cb=20150615095422", listOf(
            Ingredient("Metal", 5, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/e/e1/Metal.png/revision/latest?cb=20150615123338"),
            Ingredient("Flint", 5, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/2/2e/Flint.png/revision/latest?cb=20150615101007"),
            Ingredient("Fiber", 30, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/4/45/Fiber.png/revision/latest?cb=20200518133132"),
        )),
        Crafting("Magnifying Glass",  "Tool", "N/A", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/5/5f/Magnifying_Glass.png/revision/latest?cb=20220905113952", listOf(
            Ingredient("Wood", 15, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/d/d4/Stone.png/revision/latest?cb=20150615120930"),
            Ingredient("Hide", 20, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/9/96/Hide.png/revision/latest?cb=20150615102457"),
            Ingredient("Fiber", 20, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/4/45/Fiber.png/revision/latest?cb=20200518133132"),
            Ingredient("Crystal", 30, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/3/31/Crystal.png/revision/latest?cb=20150618193219"),
            Ingredient("Obsidian", 15, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/2/23/Obsidian.png/revision/latest?cb=20150615125926"),
            Ingredient("Metal Ingot", 8, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/3/37/Metal_Ingot.png/revision/latest?cb=20150615125857"),
        )),
        Crafting("Paintbrush",  "Tool", "N/A", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/c/c4/Paintbrush.png/revision/latest?cb=20150615120520", listOf(
            Ingredient("Wood", 1, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/d/d4/Stone.png/revision/latest?cb=20150615120930"),
            Ingredient("Hide", 3, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/9/96/Hide.png/revision/latest?cb=20150615102457"),
            Ingredient("Thatch", 10, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/5/51/Thatch.png/revision/latest?cb=20150615130514"),
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

        Crafting("Flamethrower", "Gun", "40", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/4/47/Flamethrower_%28Scorched_Earth%29.png/revision/latest?cb=20160901234619", listOf(
            Ingredient("Polymer", 75, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/8/81/Polymer.png/revision/latest?cb=20150615130200"),
            Ingredient("Cementing Paste", 50, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/0/03/Cementing_Paste.png/revision/latest?cb=20180801020251"),
            Ingredient("Metal Ingot", 35, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/3/37/Metal_Ingot.png/revision/latest?cb=20150615125857"),
            Ingredient("Sulfur", 10, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/c/cf/Sulfur_%28Scorched_Earth%29.png/revision/latest?cb=20160901225856"),
            Ingredient("Electronics", 15, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/d/dd/Electronics.png/revision/latest?cb=20150615100650"),
        )),
        Crafting("Minigun", "Gun", "200", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/2/2b/Minigun_%28Genesis_Part_2%29.png/revision/latest?cb=20210603191503", listOf(
            Ingredient("Polymer", 175, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/8/81/Polymer.png/revision/latest?cb=20150615130200"),
            Ingredient("Metal Ingot", 500, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/3/37/Metal_Ingot.png/revision/latest?cb=20150615125857"),
            Ingredient("Cementing Paste", 100, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/0/03/Cementing_Paste.png/revision/latest?cb=20180801020251"),
            Ingredient("Electronics", 10, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/d/dd/Electronics.png/revision/latest?cb=20150615100650"),
        )),
        Crafting("Lance", "Melee", "40", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/f/f8/Lance.png/revision/latest?cb=20170131150550", listOf(
            Ingredient("Flint", 100, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/2/2e/Flint.png/revision/latest?cb=20150615101007"),
            Ingredient("Hide", 70, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/9/96/Hide.png/revision/latest?cb=20150615102457"),
            Ingredient("Pelt", 70, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/4/45/Pelt.png/revision/latest?cb=20150929052115"),
            Ingredient("Fiber", 120, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/4/45/Fiber.png/revision/latest?cb=20200518133132"),
            Ingredient("Obsidian", 100, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/2/23/Obsidian.png/revision/latest?cb=20150615125926"),
            Ingredient("Metal Ingot", 260, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/3/37/Metal_Ingot.png/revision/latest?cb=20150615125857"),
        )),
        Crafting("Pike", "Melee", "40", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/3/31/Pike.png/revision/latest?cb=20150615120808", listOf(
            Ingredient("Metal Ingot", 10, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/3/37/Metal_Ingot.png/revision/latest?cb=20150615125857"),
            Ingredient("Wood", 10, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/d/d4/Stone.png/revision/latest?cb=20150615120930"),
            Ingredient("Hide", 20, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/9/96/Hide.png/revision/latest?cb=20150615102457"),
        )),
        Crafting("Boomerang", "Ranged", "N/A", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/1/17/Boomerang_%28Scorched_Earth%29.png/revision/latest?cb=20170104111935", listOf(
            Ingredient("Fiber", 15, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/4/45/Fiber.png/revision/latest?cb=20200518133132"),
            Ingredient("Wood", 3, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/d/d4/Stone.png/revision/latest?cb=20150615120930"),
            Ingredient("sand", 5, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/0/0c/Sand_%28Scorched_Earth%29.png/revision/latest?cb=20160901230939"),
        )),
        Crafting("Slingshot", "Ranged", "40", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/3/3f/Slingshot.png/revision/latest?cb=20150615120746", listOf(
            Ingredient("Hide", 1, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/9/96/Hide.png/revision/latest?cb=20150615102457"),
            Ingredient("Wood", 5, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/d/d4/Stone.png/revision/latest?cb=20150615120930"),
            Ingredient("Fiber", 20, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/4/45/Fiber.png/revision/latest?cb=20200518133132"),
        )),
        Crafting("Flare Gun", "Gun", "N/A", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/5/57/Flare_Gun.png/revision/latest?cb=20150615101356", listOf(
            Ingredient("Wood", 4, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/d/d4/Stone.png/revision/latest?cb=20150615120930"),
            Ingredient("Fiber", 2, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/4/45/Fiber.png/revision/latest?cb=20200518133132"),
            Ingredient("Sparkpowder", 10, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/5/56/Sparkpowder.png/revision/latest?cb=20150615114856"),
            Ingredient("Gunpowder", 2, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/a/ae/Gunpowder.png/revision/latest?cb=20150701125817"),
        )),
        Crafting("Fabricated Sniper Rifle", "Gun", "70", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/9/9e/Fabricated_Sniper_Rifle.png/revision/latest?cb=20151021221251", listOf(
            Ingredient("Polymer", 115, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/8/81/Polymer.png/revision/latest?cb=20150615130200"),
            Ingredient("Metal Ingot", 80, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/3/37/Metal_Ingot.png/revision/latest?cb=20150615125857"),
            Ingredient("Cementing Paste", 110, "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/0/03/Cementing_Paste.png/revision/latest?cb=20180801020251"),
        )),
    )

    val craftingCategories = listOf(
        Card("Clothing", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/f/f3/Hide_Shirt.png/revision/latest?cb=20150615102418"),
        Card("Structures", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/d/d0/Storage_Box.png/revision/latest?cb=20150615115357"),
        Card("Tools", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/9/9f/Metal_Pick.png/revision/latest?cb=20150615120217"),
        Card("Weapons", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/c/c8/Wooden_Club.png/revision/latest?cb=20151003050839"),
    )


    /*
    * DINOSAURS
    * */
    
    val arks = listOf(
        Card("All", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/5/5b/ARK_Icon.png/revision/latest?cb=20190106013307"),
        Card("Island", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/0/04/The_Island_Topographic_Map.jpg/revision/latest/scale-to-width-down/1000?cb=20181020211505"),
        Card("Desert", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/3/39/Scorched_Earth_Topographic_Map.jpg/revision/latest/scale-to-width-down/1000?cb=20181020211511"),
        Card("Underground", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/6/68/Aberration_Map.jpg/revision/latest/scale-to-width-down/1000?cb=20220905075434"),
        Card("Corrupted Earth", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/0/0b/Extinction_Topographic_Map.jpg/revision/latest/scale-to-width-down/1000?cb=20190122164234"),
        Card("Simulation", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/3/37/Genesis_Part_1_Topographic_Map.jpg/revision/latest/scale-to-width-down/1000?cb=20220905121759"),
        Card("Colony Ship", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/4/44/Genesis_Part_2_Map.jpg/revision/latest/scale-to-width-down/1000?cb=20210603191823"),
        Card("The Center", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/5/58/The_Center_Topographic_Map.jpg/revision/latest/scale-to-width-down/1000?cb=20161126134907"),
        Card("Norse", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/8/88/Ragnarok_Topographic_Map.jpg/revision/latest/scale-to-width-down/1000?cb=20181020195310"),
        Card("Grand", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/d/de/Valguero_Topographic_Map.jpg/revision/latest/scale-to-width-down/1000?cb=20220326124105"),
        Card("Crystalline", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/7/70/Crystal_Isles_Topographic_Map.jpg/revision/latest/scale-to-width-down/1000?cb=20200705193753"),
        Card("Lost Island", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/4/45/Lost_Island_map.jpg/revision/latest/scale-to-width-down/1000?cb=20211214195403"),
    )
    
    val dinosaurs = listOf(
        Dinosaur("Acrocanthosaurus", Diet.CARNIVORE, "Aggressive", "Raw Mutton", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/c/ce/Mod_ARK_Additions_Acrocanthosaurus_image_3.jpg/revision/latest/scale-to-width-down/1000?cb=20200409194205", "", emptyList()),
        Dinosaur("Allosaurus", Diet.CARNIVORE, "Aggressive", "Raw Mutton", "https://www.dododex.com/media/creature/allosaurus.png", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/3/35/S_allosaurus_startled.OGG/revision/latest?cb=20161129154952", listOf(
            Type.ISLAND, Type.CENTER, Type.NORSE, Type.CORRUPTED, Type.GRAND, Type.CRYSTALLINE, Type.COLONY, Type.LOST)),
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
        Dinosaur("Wyvern", Diet.CARNIVORE, "Aggressive", "N/A", "https://www.dododex.com/media/creature/wyvern.png", "", listOf(Type.DESERT, Type.NORSE, Type.GRAND, Type.LOST)),
        Dinosaur("Yutyrannus", Diet.CARNIVORE, "Aggressive", "Raw Mutton", "https://www.dododex.com/media/creature/yutyrannus.png", "https://static.wikia.nocookie.net/arksurvivalevolved_gamepedia/images/0/02/Yutyrannussound.ogg/revision/latest?cb=20180403215848", listOf(Type.ISLAND, Type.CENTER, Type.DESERT, Type.NORSE, Type.CORRUPTED, Type.GRAND, Type.CRYSTALLINE, Type.COLONY, Type.LOST)),
    )
}
