package PROBLEMSOLVING.PlacementPracticeProblems;

// Coding Question : Maximum sum of a subarray of length atleast k (Amazon SDE-1)

// Problem Statement:
// Given an array of size N, find Maximum sum of a subarray whose length is at least K.
// if the sum is negative return 0.

// Explanation: Maximum sum of a subarray of length >= k: [4,5,-1] = 8 

// Input:
// N = 6, K = 3, Array = [-2, 1, -3, 4, 5, -1]

// Output: 8

public class MaxSubArraySumOfAtleastK {
    public static int maxSum(int[] nums, int k) {
        int len = nums.length;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int idx = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        max = Math.max(max, sum);
        for (int i = k; i < len; i++) {
            sum += nums[i];
            if (sum < sum - nums[idx] && (i - idx + 1 >= k)) {
                sum -= nums[idx++];
            }
            max = Math.max(max, sum);
        }
        return max < 0 ? 0 : max;
    }

    public static void main(String[] args) {
        // int[] nums = { -2, 1, -3, 4, 5, -1 };
        int[] nums = { -3, 5, -8, -10, 99, -100, 50 };
        int k = 4;
        System.out.println("Max sum: " + maxSum(nums, k));
    }
}
