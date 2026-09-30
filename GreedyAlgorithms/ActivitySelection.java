package GreedyAlgorithms;

import java.util.ArrayList;

public class ActivitySelection {
    public static void main(String[] args) {
        int[] start = { 1, 3, 0, 5, 8, 5 };
        int[] end = { 2, 4, 6, 7, 9, 9 };
        // already sorted on the basis of end time
        int len = start.length;

        int count = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        int lastActivityIdx = -1;

        // choose 1st activity
        count = 1;
        ans.add(0);
        lastActivityIdx = 0;

        for (int i = 1; i < len; i++) {
            if (start[i] >= end[lastActivityIdx]) {
                count++;
                ans.add(i);
                lastActivityIdx = i;
            }
        }
        System.out.println("Max activities performed = " + count);
        for (int i = 0; i < ans.size(); i++) {
            System.out.println("A" + ans.get(i));
        }
    }
}
