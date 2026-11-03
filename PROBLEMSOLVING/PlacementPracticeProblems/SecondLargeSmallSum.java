package PROBLEMSOLVING.PlacementPracticeProblems;

// You are required to implement the following Function 
// def LargeSmallSum(arr)
// The function accepts an integers arr of size ’length’ as its arguments you are required to return the sum of second largest  element from the even positions and second smallest from the odd position of given ‘arr’

// Assumption:
// All array elements are unique
// Treat the 0th position as even
// NOTE
// Return 0 if array is empty
// Return 0, if array length is 3 or less than 3

// Example
// Input
// arr: 3 2 1 7 5 4
// Output: 7
// Explanation
// Second largest among even position elements(1 3 5) is 3
// Second smallest among odd position element is 4
// Thus output is 3+4 = 7

// Sample Input
// arr:1 8 0 2 3 5 6
// Sample Output: 8

public class SecondLargeSmallSum {
    public static int largeSmallSum(int[] arr) {
        int len = arr.length;
        // base case
        if (len <= 3)
            return 0;
        int small1 = Integer.MAX_VALUE;
        int small2 = Integer.MAX_VALUE;
        int large1 = Integer.MIN_VALUE;
        int large2 = Integer.MIN_VALUE;
        for (int i = 0; i < len; i = i + 2) {
            // large part
            if (large1 < arr[i]) {
                large2 = large1;
                large1 = arr[i];
            } else if (arr[i] > large2) {
                large2 = arr[i];
            }
            // small part
            if (i + 1 < len) {
                if (small1 > arr[i + 1]) {
                    small2 = small1;
                    small1 = arr[i + 1];
                } else if (arr[i + 1] < small2) {
                    small2 = arr[i + 1];
                }
            }
        }
        return small2 + large2;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 2, 1, 7, 5, 4 };
        // int[] arr = { 1, 8, 0, 2, 3, 5, 6 };
        int sum = largeSmallSum(arr);
        System.out.println("Sum: " + sum);
    }
}
