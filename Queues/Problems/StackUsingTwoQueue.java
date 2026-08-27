package Queues.Problems;

import java.util.*;

public class StackUsingTwoQueue {
    public static class Stack {
        Queue<Integer> q1 = new ArrayDeque<>();
        Queue<Integer> q2 = new ArrayDeque<>();

        public boolean isEmpty() {
            return q1.isEmpty();
        }

        //! this method take only one Queue
        // public void push(int data) {
        //     int size = q1.size();
        //     q1.add(data); // Naya element peeche daala
            
        //     // Purane saare elements ko aage se nikaal kar peeche daal do
        //     for (int i = 0; i < size; i++) {
        //         q1.add(q1.remove());
        //     }
        // }

        public void push(int data) { // O(n)
            while (!q1.isEmpty()) {
                q2.add(q1.remove());
            }
            q1.add(data);
            while (!q2.isEmpty()) {
                q1.add(q2.remove());
            }
        }

        public int pop() {
            if (q1.isEmpty()) {
                return -1;
            }
            return q1.remove();
        }

        public int peek() {
            if (q1.isEmpty()) {
                return -1;
            }
            return q1.peek();
        }
    }
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(29);
        s.push(76);
        s.push(2);

        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
}
