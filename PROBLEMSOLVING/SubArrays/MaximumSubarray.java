package PROBLEMSOLVING.SubArrays;

public class MaximumSubarray {
    public static int maxSubArraySumII(int[] nums) {
        int sum = 0;
        int max = Integer.MIN_VALUE;

        for (int num : nums) {
            sum += num;
            // Update before resetting
            max = Math.max(max, sum);
            if (sum < 0) {
                sum = 0;
            }
        }
        return max;
    }

    public static int maxSubArraySum(int[] nums) {
        int sum = 0;
        int max = Integer.MIN_VALUE;

        // check if array conatains only -ve values
        for (int num : nums) {
            max = Math.max(max, num);
        }

        if (max < 0)
            return max;
        else
            max = 0;

        for (int num : nums) {
            sum += num;
            if (sum < 0)
                sum = 0;
            max = Math.max(max, sum);
        }
        return max;
    }

    public static void main(String[] args) {
        // int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        // int[] nums = {3,3,7,7,10,11,11};
        // int[] nums = { -33, -7, -7, -10, -11, -11 };
        int[] nums = { -33, -7, -7, -10, 0, -11, -11 };
        int max = maxSubArraySum(nums);
        System.out.println("Max: " + max);
    }
}
