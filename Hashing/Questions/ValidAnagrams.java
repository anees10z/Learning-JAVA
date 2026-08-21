package Hashing.Questions;

import java.util.HashMap;

public class ValidAnagrams {

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length())
            return false;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); ++i) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (int i = 0; i < t.length(); ++i) {
            char curr = t.charAt(i);
            if (map.containsKey(curr)) {
                int freq = map.get(curr);
                map.put(curr, freq - 1);
                if (map.get(curr) == 0) {
                    map.remove(curr);
                }
                // int freq = map.get(curr);
                // if (freq == 1) {
                // map.remove(curr); // if freq = 1 remove directly no need to put
                // } else {
                // map.put(curr, freq - 1);
                // }
            } else {
                return false;
            }
        }
        return map.isEmpty();
    }

    public static void main(String[] args) {
        String s = "tulip";
        String t = "tupil";

        boolean res = isAnagram(s, t);
        System.out.println("Result: " + res);

    }
}
