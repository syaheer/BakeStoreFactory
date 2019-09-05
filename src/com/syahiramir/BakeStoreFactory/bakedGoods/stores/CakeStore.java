package com.syahiramir.BakeStoreFactory.bakedGoods.stores;

import com.syahiramir.BakeStoreFactory.BakeryStore;
import com.syahiramir.BakeStoreFactory.bakedGoods.BakedGood;
import com.syahiramir.BakeStoreFactory.bakedGoods.cake.CarrotCake;
import com.syahiramir.BakeStoreFactory.bakedGoods.cake.CheeseCake;
import com.syahiramir.BakeStoreFactory.bakedGoods.cake.RedVelvetCake;

public class CakeStore extends BakeryStore {
    @Override
    public BakedGood createBakedGood(String flavor) {
        switch (flavor) {
            case "cheese":
                return new CheeseCake();
            case "red velvet":
                return new RedVelvetCake();
            case "carrot":
                return new CarrotCake();
            default:
                return null;
        }
    }
}
