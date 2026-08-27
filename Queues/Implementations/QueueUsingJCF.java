package Queues.Implementations;

import java.util.*;

public class QueueUsingJCF {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        // can also implemented by using ArrayDeque
        // Queue<Integer> q = new ArrayDeque<>();
        try {
            System.out.println(q.remove());
        } catch (Exception e) {
            System.out.println(e);
        }
        q.add(6);
        q.add(2);
        q.add(3);
        try {
            System.out.println(q.remove());
        } catch (Exception e) {
            System.out.println(e);
        }
        q.add(27);
        System.out.println(q.peek());
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
        System.out.println(q.isEmpty());
        try {
            System.out.println(q.remove());
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Queue successfully implemented using JCF");
    }
}
