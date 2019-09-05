package com.syahiramir.BakeStoreFactory;

import com.syahiramir.BakeStoreFactory.bakedGoods.BakedGood;
import com.syahiramir.BakeStoreFactory.bakedGoods.stores.CakeStore;
import com.syahiramir.BakeStoreFactory.bakedGoods.stores.CookieStore;
import com.syahiramir.BakeStoreFactory.bakedGoods.stores.PieStore;

public class Main {

    public static void main(String[] args) {
        CakeStore cakeStore = new CakeStore();
        PieStore pieStore = new PieStore();
        CookieStore cookieStore = new CookieStore();

        BakedGood bakedGood = cakeStore.orderBakedGood("carrot");
        System.out.println("Hanifa ordered a " + bakedGood.getName() + "\n");

        bakedGood = cakeStore.orderBakedGood("cheese");
        System.out.println("Griffin ordered a " + bakedGood.getName() + "\n");

        bakedGood = cakeStore.orderBakedGood("red velvet");
        System.out.println("Olivia ordered a " + bakedGood.getName() + "\n");

        bakedGood = cookieStore.orderBakedGood("chocolate chip");
        System.out.println("Izaan ordered a " + bakedGood.getName() + "\n");

        bakedGood = cookieStore.orderBakedGood("raisin");
        System.out.println("Jeanne ordered a " + bakedGood.getName() + "\n");

        bakedGood = cookieStore.orderBakedGood("sugar");
        System.out.println("Isabel ordered a " + bakedGood.getName() + "\n");

        bakedGood = pieStore.orderBakedGood("apple");
        System.out.println("Francesco ordered a " + bakedGood.getName() + "\n");

        bakedGood = pieStore.orderBakedGood("cream");
        System.out.println("Rhian ordered a " + bakedGood.getName() + "\n");

        bakedGood = pieStore.orderBakedGood("pumpkin");
        System.out.println("Elouise ordered a " + bakedGood.getName() + "\n");
    }
}
