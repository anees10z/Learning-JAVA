package PROBLEMSOLVING.PlacementPracticeProblems;

// # Coding Question 1: The Leaderboard Rank
// ## Problem Statement
// A gaming company runs an online tournament where thousands of players compete simultaneously. All player scores are collected into a single array — completely unsorted, since scores stream in from different servers in real time.

// Goal: Given the score array and a rank (k), find the score of the player who finished in the k-th position (highest to lowest) — without fully sorting. Duplicate scores count as separate ranks.

// ## Input Format

// - Line 1: `n` — number of players
// - Line 2: `n` integers — player scores
// - Line 3: `k` — rank to find

// ## Output Format

// A single integer — the score of the player at rank `k`.

// ## Constraints

// - (1 <= n <= 10^5)
// - (1 <= k <= n)
// - Scores can repeat.
// - Aim for better than O(nlogn).

// ## Example
// Input
// 6
// 10 4 7 20 15 7
// 3
// Output
// 10
// Explanation: Scores in descending order would be `20, 15, 10, 7, 7, 4`. The 3rd-highest score is `10`.

import java.util.PriorityQueue;

public class TheLeaderBoardRank {
    public static int kthHighestScore(int[] scores, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int n = scores.length;
        for (int score : scores) {
            pq.add(score);
        }
        for (int i = 0; i < n - k; i++) {
            pq.remove();
        }
        return pq.remove();
    }

    public static void main(String[] args) {
        int[] scores = { 10, 4, 7, 20, 15, 7 };
        int k = 3;
        System.out.println("Score: " + kthHighestScore(scores, k));
    }
}
