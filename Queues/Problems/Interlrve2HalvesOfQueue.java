package Queues.Problems;

import java.util.*;

public class Interlrve2HalvesOfQueue {
    public static void main(String[] args) {
        Queue<Integer> q1 = new ArrayDeque<>();
        Queue<Integer> q2 = new ArrayDeque<>();
        q1.add(1);
        q1.add(2);
        q1.add(3);
        q1.add(4);
        q1.add(5);
        q1.add(6);
        q1.add(7);
        q1.add(8);
        q1.add(9);
        q1.add(10);
        int half = q1.size() / 2;
        // store first half in 2nd queue
        for (int i = 0; i < half; ++i) {
            q2.add(q1.remove());
        }
        for (int i = 0; i < half; ++i) {
            q1.add(q2.remove());
            q1.add(q1.remove());
        }

        while (!q1.isEmpty()) {
            System.out.println(q1.remove());
        }
    }
}
