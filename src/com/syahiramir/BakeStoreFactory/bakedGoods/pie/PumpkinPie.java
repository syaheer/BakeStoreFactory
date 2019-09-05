package com.syahiramir.BakeStoreFactory.bakedGoods.pie;

import com.syahiramir.BakeStoreFactory.bakedGoods.BakedGood;

public class PumpkinPie extends BakedGood {
    public PumpkinPie() {
        name = "Pie";
        flavor = "Pumpkin";

        ingredients.add("Pie Crust");
        ingredients.add("Eggs");
        ingredients.add("Pumpkin Puree");
        ingredients.add("Condensed Milk");
        ingredients.add("Pumpkin Spice");
    }
}
