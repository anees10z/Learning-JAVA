package GreedyAlgorithms;

import java.util.*;

public class MaxLengthChainOfPairs {
    public static void main(String[] args) {
        int[][] pairs = { { 5, 24 }, { 45, 49 }, { 39, 60 }, { 5, 28 }, { 27, 40 }, { 50, 90 } };
        int chainLen = 0;

        Arrays.sort(pairs, Comparator.comparingInt(o -> o[1])); //(nlogn)
        chainLen = 1;
        int chainEndValue = pairs[0][1];
        for (int i = 1; i < pairs.length; i++) {
            if (pairs[i][0] > chainEndValue) {
                chainLen++;
                chainEndValue = pairs[i][1];
            }
        }

        System.out.println("Chain length = " + chainLen);
    }
}
