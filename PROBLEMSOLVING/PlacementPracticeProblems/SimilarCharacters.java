package PROBLEMSOLVING.PlacementPracticeProblems;

// Coding Question : Similar Character (TCS CodeVita)

// Problem Statement:
// Given a string S and Q queries. For each query position P, count how many times the character at position P has appered earlier in the string (positions 1 to P-1).

// Input Format:
// N = length of string
// S = string
// Q = number of Queries
// P = query position (for each query)

// Example 1:
// Input:
// N = 7
// S = ABACABA
// Q = 2
// P = 4 7
// Output: 0 3

public class SimilarCharacters {
    public static void similarChar(String s, int n, int[] p, int q) {
        int[] freq = new int[26];
        int[] preCount = new int[n];
        for (int i = 0; i < n; i++) {
            char curr = s.charAt(i);
            preCount[i] = freq[curr - 'A'];
            freq[curr - 'A']++;
        }
        for (int i = 0; i < q; i++)
            System.out.println(preCount[p[i] - 1]);
    }

    public static void main(String[] args) {
        String s = "ABACABA";
        int n = s.length();
        int[] p = { 4, 7 };
        // int[] p = { 4, 7, 2, 5, 1 };
        int q = p.length;
        similarChar(s, n, p, q);
    }
}
