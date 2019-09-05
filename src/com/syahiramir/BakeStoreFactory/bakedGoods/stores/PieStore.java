package com.syahiramir.BakeStoreFactory.bakedGoods.stores;

import com.syahiramir.BakeStoreFactory.BakeryStore;
import com.syahiramir.BakeStoreFactory.bakedGoods.BakedGood;
import com.syahiramir.BakeStoreFactory.bakedGoods.pie.ApplePie;
import com.syahiramir.BakeStoreFactory.bakedGoods.pie.CreamPie;
import com.syahiramir.BakeStoreFactory.bakedGoods.pie.PumpkinPie;

public class PieStore extends BakeryStore {
    @Override
    public BakedGood createBakedGood(String flavor) {
        switch (flavor) {
            case "apple":
                return new ApplePie();
            case "cream":
                return new CreamPie();
            case "pumpkin":
                return new PumpkinPie();
            default:
                return null;
        }
    }
}
