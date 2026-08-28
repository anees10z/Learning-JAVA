package Queues.DoubleEndedQueue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeImplementation {
    public static void main(String[] args) {

        Deque<Integer> deque = new ArrayDeque<>();

        // 1. addFirst & addLast
        deque.addFirst(10); // [10]
        deque.addLast(20); // [10, 20]
        deque.addFirst(5); // [5, 10, 20]
        deque.addLast(30); // [5, 10, 20, 30]

        System.out.println("Deque: " + deque);

        // 2. getFirst & getLast (Bina remove kiye check karna)
        System.out.println("First element: " + deque.getFirst());
        System.out.println("Last element: " + deque.getLast());

        // 3. size & isEmpty
        System.out.println("Size: " + deque.size());
        System.out.println("Is Empty: " + deque.isEmpty());

        // 4. contains
        System.out.println("Contains 20: " + deque.contains(20));
        System.out.println("Contains 99: " + deque.contains(99));

        // 5. removeFirst & removeLast
        System.out.println("Removed First: " + deque.removeFirst());
        System.out.println("Removed Last: " + deque.removeLast());

        System.out.println("Deque after removals: " + deque);

        // 6. clear
        deque.clear();
        System.out.println("After clear: " + deque);
        System.out.println("Is Empty after clear: " + deque.isEmpty());
    }
}