package com.syahiramir.BakeStoreFactory.bakedGoods.pie;

import com.syahiramir.BakeStoreFactory.bakedGoods.BakedGood;

public class ApplePie extends BakedGood {
    public ApplePie() {
        name = "Pie";
        flavor = "Apple";

        ingredients.add("Pie Crust");
        ingredients.add("Apples");
        ingredients.add("Sugar");
        ingredients.add("Flour");
        ingredients.add("Cinnamon");
        ingredients.add("Salt");
    }
}
