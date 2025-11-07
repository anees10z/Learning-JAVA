package Recursion;

import java.util.HashSet;

public class UniqueSubsequences {
    public static int count = 0; // to count total number of subsequence

    public static void uniqueSequences(String str, int index, String newString, HashSet<String> set) {
        // base case
        if (index == str.length()) {
            if (set.contains(newString))
                return;
            else {
                count++;
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }

        // current char to be in sequence
        uniqueSequences(str, index + 1, newString + str.charAt(index), set);

        // current char not to be in sequence
        uniqueSequences(str, index + 1, newString, set);
    }

    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        String str = "aaa";
        uniqueSequences(str, 0, "", set);
        System.out.println("\nTotal number of subsequences = " + count);
    }
}
