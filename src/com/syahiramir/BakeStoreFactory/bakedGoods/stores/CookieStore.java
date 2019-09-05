package com.syahiramir.BakeStoreFactory.bakedGoods.stores;

import com.syahiramir.BakeStoreFactory.BakeryStore;
import com.syahiramir.BakeStoreFactory.bakedGoods.BakedGood;
import com.syahiramir.BakeStoreFactory.bakedGoods.cookie.ChocolateChipCookie;
import com.syahiramir.BakeStoreFactory.bakedGoods.cookie.RaisinCookie;
import com.syahiramir.BakeStoreFactory.bakedGoods.cookie.SugarCookie;

public class CookieStore extends BakeryStore {
    @Override
    public BakedGood createBakedGood(String flavor) {
        switch (flavor) {
            case "chocolate chip":
                return new ChocolateChipCookie();
            case "raisin":
                return new RaisinCookie();
            case "sugar":
                return new SugarCookie();
            default:
                return null;
        }
    }
}
