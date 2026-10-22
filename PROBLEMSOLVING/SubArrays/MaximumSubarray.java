package PROBLEMSOLVING.SubArrays;

// LC_53

public class MaximumSubarray {
    public static int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        return max;
    }

    public static void main(String[] args) {
        int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        // int[] nums = {3,3,7,7,10,11,11};
        // int[] nums = {-33,-7,-7,-10,-11,-11};
        // int[] nums = {-33,-7,-7,-10,0,-11,-11};
        maxSubArray(nums);
    }
}
