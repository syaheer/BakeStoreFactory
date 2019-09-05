package com.syahiramir.BakeStoreFactory;

import com.syahiramir.BakeStoreFactory.bakedGoods.BakedGood;

public abstract class BakeryStore {
    public abstract BakedGood createBakedGood(String flavor);

    public BakedGood orderBakedGood(String type) {
        BakedGood bakedGood = createBakedGood(type);
        System.out.println("---- Making a " + bakedGood.getName() + " ----");
        bakedGood.prepare();
        bakedGood.collectIngredients();
        bakedGood.mix();
        bakedGood.bake();
        bakedGood.box();
        return bakedGood;
    }
}
