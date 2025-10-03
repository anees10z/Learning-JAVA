package ArraysAndSorting;

public class PrintSubArray {
    public static void prntSbArr(int[] arr) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int count = 0;
        int[] prefixSum = new int[arr.length];
        // calculating prefix sum
        prefixSum[0] = arr[0];
        for (int i = 1; i < prefixSum.length; ++i) {
            prefixSum[i] = arr[i] + prefixSum[i - 1];
        }
        for (int i = 0; i < arr.length; ++i) { // for start
            for (int j = i; j < arr.length; ++j) { // for start to end
                int sum = 0;
                // for (int k = i; k <= j; ++k) { // for print sub array
                // System.out.print(arr[k] + " ");
                // sum += arr[k]; // brute force method O(n^3)
                // }

                // prefix sum method O(n^2)
                sum = i == 0 ? prefixSum[j] : prefixSum[j] - prefixSum[i - 1];

                if (sum < min)
                    min = sum;
                if (sum > max)
                    max = sum;
                System.out.print("    sum of this sub array = " + sum);
                count++;
                System.out.println();
            }
        }
        System.out.println("Total sub array = " + count);
        System.out.println("Max sub array sum = " + max);
        System.out.println("Min sub array sum = " + min);
    }

    // Max sub-Array sum using Kadane's Algorithm O(n)
    public static void kadanes(int[] arr) {
        int currSum = 0;
        int max = 0;
        for (int i : arr) {
            currSum += i;
            if (currSum < 0)
                currSum = 0;
            max = Math.max(currSum, max);
        }

        // if all numbers are negative then?
        if (max == 0) { // if only -ve nos then +ve maxSum is zero
            System.out.println("\n\nMax sum = " + max(arr)); // when all -ve
        } else {
            System.out.println("\n\nMax sum = " + max); // mix of +ve, -ve
        }
    }

    public static int max(int[] num) {
        int max = Integer.MIN_VALUE;
        for (int i : num) {
            if (i > max)
                max = i;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = { 1, -2, 6, -1, 3 };
        int[] num = { -2, -4, -5, -1, -9 };
        // int[] num1 = {1,1,-2};
        prntSbArr(arr);
        kadanes(arr);
        kadanes(num);
    }
}
