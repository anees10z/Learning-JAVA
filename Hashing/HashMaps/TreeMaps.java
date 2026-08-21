// package Hashing.HashMaps;

import java.util.TreeMap;

public class TreeMaps {
    public static void main(String[] args) {
        TreeMap<String, Integer> hm = new TreeMap<>();
        System.out.println(hm);

        // insert
        hm.put("mango", 60);
        hm.put("banana", 70);
        hm.put("orange", 40);
        hm.put("watermelon", 25);
        hm.put("grapes", 35);
        System.out.println(hm);
    }
}
