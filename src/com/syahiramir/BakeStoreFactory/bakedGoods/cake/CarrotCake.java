package com.syahiramir.BakeStoreFactory.bakedGoods.cake;

import com.syahiramir.BakeStoreFactory.bakedGoods.BakedGood;

public class CarrotCake extends BakedGood {

    public CarrotCake() {
        name = "Cake";
        flavor = "Carrot";

        ingredients.add("Sugar");
        ingredients.add("Eggs");
        ingredients.add("Flour");
        ingredients.add("Baking Soda");
        ingredients.add("Salt");
        ingredients.add("Carrots");
        ingredients.add("Walnuts");
    }
}
