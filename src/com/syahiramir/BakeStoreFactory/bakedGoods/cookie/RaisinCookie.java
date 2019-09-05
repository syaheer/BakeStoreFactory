package com.syahiramir.BakeStoreFactory.bakedGoods.cookie;

import com.syahiramir.BakeStoreFactory.bakedGoods.BakedGood;

public class RaisinCookie extends BakedGood {
    public RaisinCookie() {
        name = "Cookie";
        flavor = "Raisin";

        ingredients.add("Flour");
        ingredients.add("Baking Soda");
        ingredients.add("Salt");
        ingredients.add("Walnuts");
        ingredients.add("Brown Sugar");
        ingredients.add("Eggs");
        ingredients.add("Raisins");
    }
}
