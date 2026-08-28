package Queues.DoubleEndedQueue;

import java.util.ArrayDeque;
import java.util.Deque;

public class QueueUsingDeque {

    // Custom Queue Class
    public static class MyQueue {
        private Deque<Integer> deque = new ArrayDeque<>();

        // 1. Add  (O(1))
        public void add(int data) {
            deque.addLast(data);
        }

        // 2. Remove  (O(1))
        public int remove() {
            if (isEmpty()) {
                System.out.println("Queue is Empty!");
                return -1;
            }
            return deque.removeFirst();
        }

        // 3. Peek:  (O(1))
        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is Empty!");
                return -1;
            }
            return deque.getFirst();
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
        MyQueue queue = new MyQueue();

        // Add operations
        queue.add(10);
        queue.add(20);
        queue.add(30);

        System.out.println("Front element (peek): " + queue.peek()); 
        System.out.println("Queue size: " + queue.size());           

        // Remove operations (FIFO Order)
        System.out.println("Removed: " + queue.remove()); 
        System.out.println("Removed: " + queue.remove()); 

        System.out.println("Front element now: " + queue.peek());  
        System.out.println("Is empty: " + queue.isEmpty());        

        System.out.println("Removed: " + queue.remove()); 
        System.out.println("Is empty: " + queue.isEmpty());        
    }
}
