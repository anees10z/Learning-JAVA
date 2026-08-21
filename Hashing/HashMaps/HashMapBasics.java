// package Hashing.HashMaps;

import java.util.HashMap;
import java.util.Set;

public class HashMapBasics {
    public static void main(String[] args) {
        // create
        HashMap<String, Integer> hm = new HashMap<>();
        System.out.println(hm);

        // insert
        hm.put("mango", 60);
        hm.put("banana", 70);
        hm.put("orange", 40);
        hm.put("watermelon", 25);
        hm.put("grapes", 35);
        System.out.println(hm);

        // get
        int cost = hm.get("banana");
        System.out.println(cost);
        System.out.println(hm.get("pear"));

        // ContainsKey
        System.out.println(hm.containsKey("mango"));
        System.out.println(hm.containsKey("apple"));

        // remove
        System.out.println(hm.remove("mango"));
        System.out.println(hm.remove("apple"));

        // size
        System.out.println(hm.size());

        // isEmpty
        System.out.println(hm.isEmpty());

        // ! clear
        // hm.clear();
        // System.out.println(hm);

        // entrySet
        System.out.println(hm.entrySet());

        // iteration on hashmap using set
        Set<String> keys = hm.keySet();
        for (String k : keys) {
            System.out.println("Key: " + k + " , value: " + hm.get(k));
        }
        ;
    }
}
