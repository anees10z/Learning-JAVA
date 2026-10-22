package PROBLEMSOLVING.SubArrays;

// Q1 (Subarray)
// Array: [1, 2, 3, 7, 5], target 12
// Find any subarray with sum = 12 (1-indexed start/end).
// Hint: all positive → sliding window.
public class SubArraySumToTarget {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 7, 5 };
        int target = 12;

        int left = 0;
        int sum = 0;
        int start = -1, end = -1;

        for (int right = 0; right < nums.length; right++) {
            sum += nums[right];

            while (sum > target && left <= right) {
                sum -= nums[left++];
            }

            if (sum == target) {
                start = left;
                end = right;
                break;
            }
        }

        if (start == -1) {
            System.out.println("No subarray found");
        } else {
            System.out.println("1-indexed: " + (start + 1) + " to " + (end + 1));
            for (int i = start; i <= end; i++) {
                System.out.print(nums[i] + " ");
            }
            System.out.println();
        }
    }
}
    // public class SubArraySumToTarget {
//     public static void main(String[] args) {
//         int[] nums = { 1, 2, 3, 7, 5 };
//         int target = 12;
//         int idx = 0;
//         int lastIdx = nums.length - 1;
//         int sum = 0;
//         int len = nums.length;
//         for (int i = 0; i < len; i++) {
//             sum += nums[i];

//             if (sum > target) {
//                 while (sum > target && idx < i) {
//                     sum -= nums[idx++];
//                 }
//             }
//             if (sum == target) {
//                 lastIdx = i;
//                 break;
//             }
//         }
//         for (int i = idx; i <= lastIdx; i++) {
//             System.out.print(nums[i] + " ");
//         }
//         System.out.println();
//     }
