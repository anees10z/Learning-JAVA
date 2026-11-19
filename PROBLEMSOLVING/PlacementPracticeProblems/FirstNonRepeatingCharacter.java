package PROBLEMSOLVING.PlacementPracticeProblems;

// Given a string containing only lowercase English letters, find the first character that appears exactly once.

// Return its index. If no such character exists, return -1.

// Example 1
// Input:  "leetcode"
// Output: 0
// Explanation: 'l' appears only once.
// Example 2
// Input:  "aabbcdde"
// Output: 4
// Explanation: 'c' is the first character that appears only once.
// Example 3
// Input:  "aabb"
// Output: -1
// Constraints
// 1 <= s.length() <= 10^5
// The string contains only lowercase English letters.

public class FirstNonRepeatingCharacter {
    public static int firstNonRepeating(String s) {
        int len = s.length();
        int[] freq = new int[26];
        for (int i = 0; i < len; i++) {
            char ch = s.charAt(i);
            freq[ch - 'a']++;
        }
        for (int i = 0; i < len; i++) {
            char ch = s.charAt(i);
            if (freq[ch - 'a'] == 1)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        // String s = "leetcode";
        String s = "aabbcdde";
        // String s = "aabb";
        int idx = firstNonRepeating(s);
        System.out.println("Index: " + idx);
    }
}
