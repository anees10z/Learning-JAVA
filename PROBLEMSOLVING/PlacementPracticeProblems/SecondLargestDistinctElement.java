package PROBLEMSOLVING.PlacementPracticeProblems;

// Question 1: Second Largest Distinct Element
// Given an integer array, find the second largest distinct element.

// If the array does not contain a second largest distinct element, return -1.

// Example 1
// Input:  [10, 5, 8, 20, 20]
// Output: 10
// The largest distinct element is 20, and the second largest is 10.

// Example 2
// Input:  [7, 7, 7]
// Output: -1
// There is only one distinct element.

// Example 3
// Input:  [-10, -5, -20]
// Output: -10
// Constraints
// 1 <= arr.length <= 10^5
// Array elements can be any Java int value.
// Try to solve it without sorting.

public class SecondLargestDistinctElement {
    public static int secondLargest(int[] arr) {
        int max1 = arr[0];
        int max2 = 0;
        boolean foundSecond = false;
    
        for (int num : arr) {
            if (num > max1) {
                max2 = max1;
                max1 = num;
                foundSecond = true;
            } else if (num < max1 && (!foundSecond || num > max2)) {
                max2 = num;
                foundSecond = true;
            }
        }
    
        return foundSecond ? max2 : -1;
    }

    public static void main(String[] args) {
        // int[] arr = { 10, 5, 8, 20, 20 };
        int[] arr = { 7, 7, 7 };
        // int[] arr = { -10, -5, -20 };
        // int[] arr = { 5, Integer.MIN_VALUE };
        int res = secondLargest(arr);
        System.out.println("Result: " + res);
    }
}
