package com.syahiramir.BakeStoreFactory.bakedGoods.cookie;

import com.syahiramir.BakeStoreFactory.bakedGoods.BakedGood;

public class SugarCookie extends BakedGood {
    public SugarCookie() {
        name = "Cookie";
        flavor = "Sugar";

        ingredients.add("Flour");
        ingredients.add("Baking Soda");
        ingredients.add("Butter");
        ingredients.add("White Sugar");
        ingredients.add("Vanilla Extract");
        ingredients.add("Eggs");
    }
}
