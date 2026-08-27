package Queues.Problems;

import java.util.Stack;

public class QueueUsingTwoStack {
    public static class Queue {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        public boolean isEmpty() {
            return s1.empty();
        }

        public void add(int data) { // O(n)
            while (!s1.empty()) {
                s2.push(s1.pop());
            }
            s1.push(data);
            while (!s2.empty()) {
                s1.push(s2.pop());
            }
        }

        public int remove() {
            if (s1.empty()) {
                return -1;
            }
            return s1.pop();
        }

        public int peek() {
            if (s1.empty()) {
                return -1;
            }
            return s1.peek();
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
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
        System.out.println("Queue successfully implemented using 2 stacks");
    }
}
