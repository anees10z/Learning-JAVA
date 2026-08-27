package Queues.Implementations;

public class QueueUsingLinkedList {

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static class Queue {
        static Node head = null;
        static Node tail = null;

        public boolean isEmpty() {
            if (head == null && tail == null)
                return true;
            else
                return false;
        }

        public void add(int data) {
            Node newNode = new Node(data);

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }

        public int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            int res = head.data;
            if (head == tail) {
                head = tail = null;
            } else {
                head = head.next;
            }
            return res;
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(6);
        q.add(2);
        q.add(3);
        System.out.println(q.remove());
        q.add(27);
        System.out.println(q.peek());
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }

        System.out.println(q.isEmpty());
        q.remove();
    }
}
