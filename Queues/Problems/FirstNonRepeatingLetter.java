package Queues.Problems;

import java.util.*;

public class FirstNonRepeatingLetter {
    public static void main(String[] args) {
        String str = "aabccxb";
        int[] freq = new int[26]; // count the frequency of chars 'a' to 'z'
        Queue<Character> q = new ArrayDeque<>(); // track of chars for finding NonRepeatingLetters

        for (int i = 0; i < str.length(); ++i) {
            char ch = str.charAt(i);
            q.add(ch);
            freq[ch - 'a']++;

            while (freq[q.peek() - 'a'] != 1) {
                q.remove();
                if (q.isEmpty()) {
                    break;
                }
            }
            if (!q.isEmpty()) {
                System.out.print(q.peek() + " ");
            } else {
                System.out.print(-1 + " ");
            }
        }
        System.out.println();
    }
}
