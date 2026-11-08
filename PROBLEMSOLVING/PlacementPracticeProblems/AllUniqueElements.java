package PROBLEMSOLVING.PlacementPracticeProblems;

import java.util.*;

public class AllUniqueElements {
    public static void main(String[] args) {
        int[] arr = { 4, 5, 55, 6, 4, 7, 5, 9 };
        Map<Integer, Integer> freq = new HashMap<>();

        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        for (int num : arr) {
            if (freq.get(num) == 1)
                System.out.print(num + " ");
        }
        System.out.println();
    }
}
