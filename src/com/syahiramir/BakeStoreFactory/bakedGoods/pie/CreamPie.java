package com.syahiramir.BakeStoreFactory.bakedGoods.pie;

import com.syahiramir.BakeStoreFactory.bakedGoods.BakedGood;

public class CreamPie extends BakedGood {
    public CreamPie() {
        name = "Pie";
        flavor = "Cream";

        ingredients.add("Pie Crust");
        ingredients.add("Butter");
        ingredients.add("Sugar");
        ingredients.add("Cream Cheese");
        ingredients.add("Vanilla Extract");
    }
}
