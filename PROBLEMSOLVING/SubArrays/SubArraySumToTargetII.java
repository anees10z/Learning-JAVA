package PROBLEMSOLVING.SubArrays;

import java.util.Map;
import java.util.HashMap;

// Q2 (Subarray)
// Array: [1, -1, 0], K = 0
// Count subarrays with sum = 0.
// Hint: prefix sum + hashmap.

public class SubArraySumToTargetII {
    // BruteForces
    public static void bruteForceI(int[] nums, int target) { // TC - O(n^2) SC - O(n)
        int len = nums.length;
        int count = 0;

        int[] prefix = new int[len];
        prefix[0] = nums[0];
        for (int i = 1; i < len; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }

        for (int i = 0; i < len; i++) {
            for (int j = i; j < len; ++j) {
                int sum = (i == 0) ? prefix[j] : (prefix[j] - prefix[i - 1]);
                if (sum == target)
                    count++;
            }
        }
        System.out.println(count);
    }

    public static void bruteForceII(int[] nums, int target) { // TC - O(n^2) SC - O(1)
        int len = nums.length;
        int count = 0;

        for (int i = 0; i < len; i++) {
            int sum = 0;
            for (int j = i; j < len; ++j) {
                sum += nums[j];
                if (sum == target)
                    count++;
            }
        }
        System.out.println(count);
    }

    // optimal
    public static void optimal(int[] nums, int target) { // TC - O(n) SC - O(n)
        Map<Integer, Integer> map = new HashMap<>();

        int len = nums.length;
        int count = 0;

        int[] prefix = new int[len];
        prefix[0] = nums[0];
        for (int i = 1; i < len; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }

        for (int i = 0; i < len; i++) {
            if (prefix[i] == target) {
                count++;
            }
            int prefixSum = prefix[i] - target;
            if (map.containsKey(prefixSum)) {
                count += map.get(prefixSum);
            }
            map.put(prefix[i], map.getOrDefault(prefix[i], 0) + 1);
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        int[] nums = { 1, -1, 0 };
        int target = 0;

        // bruteForceI(nums, target);
        // bruteForceII(nums, target);
        optimal(nums, target);
    }
}