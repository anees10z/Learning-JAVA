package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class SumOfSubset {
    public static void findSum(int[] nums, int idx, int sum, List<List<Integer>> res, List<Integer> currSum,
            int target) {
        if (idx == nums.length) {
            if (sum == target) {
                res.add(new ArrayList<>(currSum));
            }
            return;
        }
        if (sum > target)
            return;
        if (sum == target) {
            res.add(new ArrayList<>(currSum));
            return;
        }
        sum += nums[idx];
        currSum.add(nums[idx]);
        findSum(nums, idx + 1, sum, res, currSum, target);
        sum -= nums[idx];
        currSum.remove(currSum.size() - 1);
        findSum(nums, idx + 1, sum, res, currSum, target);
    }

    public static void main(String[] args) {
        int[] nums = { 2, 3, 1, 6, 9, 4 };
        int target = 15;
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> currSum = new ArrayList<>();

        findSum(nums, 0, 0, res, currSum, target);

        for (int i = 0; i < res.size(); ++i) {
            for (int j = 0; j < res.get(i).size(); ++j) {
                System.out.print(res.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}
