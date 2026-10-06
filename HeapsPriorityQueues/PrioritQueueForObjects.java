package HeapsPriorityQueues;

import java.util.PriorityQueue;

public class PrioritQueueForObjects {
    public static class Student implements Comparable<Student> {
        String name;
        int rank;

        public Student(String name, int rank) {
            this.name = name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student s2) {
            return this.rank - s2.rank;
        }
    }

    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>();
        pq.add(new Student("A", 6)); // O(logn)
        pq.add(new Student("V", 16));
        pq.add(new Student("B", 63));
        pq.add(new Student("X", 2));
        pq.add(new Student("E", 55));

        while (!pq.isEmpty()) {
            System.out.println(pq.peek().name + " -> " + pq.peek().rank); // O(1)
            pq.remove(); // O(logn)
        }

    }
}
