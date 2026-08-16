package Hashing.HashMaps;

import java.util.HashMap;

public class HashMapBasics {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<>();
        System.out.println(hm);
        hm.put("mango", 60);
        hm.put("banana", 70);
        System.out.println(hm);
    }
}
