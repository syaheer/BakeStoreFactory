package com.syahiramir.BakeStoreFactory.bakedGoods.cake;

import com.syahiramir.BakeStoreFactory.bakedGoods.BakedGood;

public class CheeseCake extends BakedGood {
    public CheeseCake() {
        name = "Cake";
        flavor = "Cheese";

        ingredients.add("Butter");
        ingredients.add("Sugar");
        ingredients.add("Salt");
        ingredients.add("Cream Cheese");
        ingredients.add("Vanilla");
        ingredients.add("Sour Cream");
    }
}
