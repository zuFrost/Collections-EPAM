package com.zufrost.learn.map;

import java.util.*;

public class MapMain {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
//        map.put("T-Shirt", 7);
//        map.put("Jeans", 5);
//        map.put("Gloves", 11);
        map.put("T-Shirt", 5);
        map.put("Jeans", 5);
        map.put("Gloves", 5);
        System.out.println(map);
//        int value = map.put("Jeans", 4);
//        System.out.println(value);
//        System.out.println(map);

        Set<String> set = map.keySet();
        System.out.println(set);
        Collection<Integer> collections = map.values();
        System.out.println(collections);

        Set<Map.Entry<String, Integer>> values = map.entrySet();
        System.out.println(values);
        Collection<Integer> collection = map.values();
        Set<Integer> sets = new HashSet<>(collection);
        System.out.println(sets);



    }
}
