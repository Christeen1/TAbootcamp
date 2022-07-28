package com.bootcampexcercise.module8.activity;

import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Map;

public class MapActivity {

    public static void main(String[] args) {
        MapActivity c = new MapActivity();
        Map map = new HashMap();

        map.put("1", "Michael");
        map.put("2", "Deniss");
        map.put("3", "Jim");

c.print(map);

        System.out.println("Map 1 value initially: " + map.get("1"));
        System.out.println( map.get("2"));
        System.out.println(map.get("3"));
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