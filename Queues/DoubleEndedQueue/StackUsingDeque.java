package Queues.DoubleEndedQueue;

import java.util.ArrayDeque;
import java.util.Deque;

public class StackUsingDeque {

    // Custom Stack Class
    public static class MyStack {
        private Deque<Integer> deque = new ArrayDeque<>();

        // 1. Push:  (O(1))
        public void push(int data) {
            deque.addLast(data);
        }

        // 2. Pop: (O(1))
        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack is Empty!");
                return -1;
            }
            return deque.removeLast();
        }

        // 3. Peek:  (O(1))
        public int peek() {
            if (isEmpty()) {
                System.out.println("Stack is Empty!");
                return -1;
            }
            return deque.getLast();
        }

        // 4. isEmpty: 
        public boolean isEmpty() {
            return deque.isEmpty();
        }

        // 5. Size: 
        public int size() {
            return deque.size();
        }
    }

    public static void main(String[] args) {
        MyStack stack = new MyStack();

        // Push operations
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element (peek): " + stack.peek()); 
        System.out.println("Stack size: " + stack.size());

        // Pop operations (LIFO Order)
        System.out.println("Popped: " + stack.pop()); 
        System.out.println("Popped: " + stack.pop());

        System.out.println("Top element now: " + stack.peek());
        System.out.println("Is empty: " + stack.isEmpty()); 

        System.out.println("Popped: " + stack.pop()); 
        System.out.println("Is empty: " + stack.isEmpty());
    }
}
