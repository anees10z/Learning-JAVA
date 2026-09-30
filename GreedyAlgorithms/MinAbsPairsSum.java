package GreedyAlgorithms;

import java.util.*;

public class MinAbsPairsSum {
    public static void main(String[] args) {
        int[] A = { 4, 1, 8, 7 };
        int[] B = { 2, 3, 6, 5 };
        int sum = 0;

        Arrays.sort(A);
        Arrays.sort(B);

        for (int i = 0; i < A.length; i++) {
            sum += Math.abs(A[i] - B[i]);
        }

        System.out.println("sum = " + sum);
    }
}
