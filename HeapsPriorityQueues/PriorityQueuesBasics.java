package HeapsPriorityQueues;

import java.util.PriorityQueue;

public class PriorityQueuesBasics {
    public static void main(String[] args) {
        // by def ascending priority
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // descending priority
        // PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        pq.add(5); // O(logn)
        pq.add(15);
        pq.add(2);
        pq.add(1);
        pq.add(3);

        while (!pq.isEmpty()) {
            System.out.println(pq.peek()); // O(1)
            pq.remove(); // O(logn)
        }

    }
}
