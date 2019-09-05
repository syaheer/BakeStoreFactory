package com.syahiramir.BakeStoreFactory.bakedGoods;

import java.util.ArrayList;

/**
 * Created by MuhamadSyahirAmir on 8/26/2019.
 */
public abstract class BakedGood {
    protected String name;
    protected String flavor;
    protected ArrayList<String> ingredients = new ArrayList<>();

    public void prepare() {
        System.out.println("Preparing " + getName());
    }

    public void collectIngredients() {
        System.out.println("Collecting ingredients:");
        for (String ingredient : ingredients) {
            System.out.println("\t" + ingredient);
        }
    }

    public void mix() {
        System.out.println("Mixing ingredients.");
    }

    public void bake() {
        System.out.println("Baking " + getName());
    }

    public void box() {
        System.out.println("Place baked good in official BakedGoodsStore box");
    }

    public String getName() {
        return flavor + " " + name;
    }
}
