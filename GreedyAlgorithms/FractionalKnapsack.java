package GreedyAlgorithms;

import java.util.*;

public class FractionalKnapsack {
    public static void main(String[] args) {
        int[] value = { 60, 100, 120 };
        int[] weight = { 10, 20, 30 };
        int capacity = 50;
        double maxValue = 0;
        int remainingCapacity = capacity;
        double[][] ratio = new double[value.length][2];
        for (int i = 0; i < value.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = value[i] / (double) weight[i];
        }

        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        for (int i = ratio.length - 1; i >= 0; i--) {
            int idx = (int) ratio[i][0];
            if (remainingCapacity >= weight[idx]) {
                remainingCapacity -= weight[idx];
                maxValue += value[idx];
            } else {
                maxValue += (ratio[i][1] * remainingCapacity);
                remainingCapacity = 0;
                break;
            }
        }
        System.out.println("Max value = " + maxValue);
    }
}
