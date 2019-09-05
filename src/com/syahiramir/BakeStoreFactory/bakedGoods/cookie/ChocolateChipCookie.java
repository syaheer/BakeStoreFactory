package com.syahiramir.BakeStoreFactory.bakedGoods.cookie;

import com.syahiramir.BakeStoreFactory.bakedGoods.BakedGood;

public class ChocolateChipCookie extends BakedGood {
    public ChocolateChipCookie() {
        name = "Cookie";
        flavor = "Chocolate Chip";

        ingredients.add("Flour");
        ingredients.add("Baking Soda");
        ingredients.add("Salt");
        ingredients.add("Butter");
        ingredients.add("Brown Sugar");
        ingredients.add("Eggs");
        ingredients.add("Chocolate Chips");
    }
}
