package com.bootcampexcercise.module10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ElectronicItemDetails {

    public static String name;
    public static double price;

    public static double returnPriceOfItem(double itemHashMap, String name) {
        return price;
    }

    public static void main(String[] args) {

        ElectronicItemDetails m = new ElectronicItemDetails();
        HashMap itemHashmap = new HashMap();

        itemHashmap.put("100", "TV");
        itemHashmap.put("200", "Refrigerator");
        itemHashmap.put("300", "Washing machine");
        itemHashmap.put("400", "Laptop");

        ElectronicItemDetails obj = new ElectronicItemDetails();

        m.print(itemHashmap);

        System.out.println("The price of TV is: " + returnPriceOfItem(price, "TV"));
    }

    void print(Map map)
    {
        Set keySet = map.keySet();
        System.out.println("*************************************");
        System.out.println("Key\tValue");
        Iterator it = keySet.iterator();
        while (it.hasNext()) {
            String key = (String) it.next();
            System.out.println(key + "\t" + map.get(key));
        }

        System.out.println("*************************************");

    }
}


