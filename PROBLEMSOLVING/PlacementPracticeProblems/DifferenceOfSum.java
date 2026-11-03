package PROBLEMSOLVING.PlacementPracticeProblems;

// Implement the following Function 

// def differenceofSum(n, m)

// The function accepts two integers n, m as arguments Find the sum of all numbers in range from 1 to m(both inclusive) that are not divisible by n. Return difference between sum of integers not divisible by n with sum of numbers divisible by n.

// Assumption:

// n>0 and m>0
// Sum lies between integral range
// Example

// Input
// n:4
// m:20
// Output
// 90

// Explanation

// Sum of numbers divisible by 4 are 4 + 8 + 12 + 16 + 20 = 60
// Sum of numbers not divisible by 4 are 1 +2 + 3 + 5 + 6 + 7 + 9 + 10 + 11 + 13 + 14 + 15 + 17 + 18 + 19 = 150
// Difference 150 – 60 = 90
// Sample Input
// n:3
// m:10
// Sample Output: 19

public class DifferenceOfSum {
    public static int differenceofSumI(int n, int m) {
        int divByN = 0;
        int notDivByN = 0;
        for (int i = 1; i <= m; i++) {
            if (i % n == 0)
                divByN += i;
            else
                notDivByN += i;
        }
        return notDivByN - divByN;
    }

    public static int differenceofSumII(int n, int m) {
        int count = m / n;
        int divBy = n * (count * (count + 1)) / 2;
        int total = m * (m + 1) / 2;
        // int notDivBy = total - divBy;
        // return notDivBy - divBy;
        return total - 2 * divBy;
    }

    public static void main(String[] args) {
        int n = 4;
        int m = 20;
        int diff = differenceofSumII(n, m);
        System.out.println("Difference: " + diff);
    }
}
