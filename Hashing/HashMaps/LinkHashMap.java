// package Hashing.HashMaps;

import java.util.LinkedHashMap;

public class LinkHashMap{
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> hm = new LinkedHashMap<>();
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