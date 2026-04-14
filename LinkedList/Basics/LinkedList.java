package LinkedList.Basics;

public class LinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    // Methods for LinkedList Operations
    // Add node in first
    public void addInFirst(int data) {
        // step-1 Create new Node
        Node newNode = new Node(data);
        // if no node present then head and tail both points the new node
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // step-2 newNode->next = head
        newNode.next = head;
        // step-3 head = newNode
        head = newNode;
    }

    // Add node in last
    public void addInLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    // print Linked List
    public void displayLL() {
        Node temp;
        temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String args[]) {
        LinkedList ll = new LinkedList();
        ll.addInFirst(20);
        ll.addInFirst(70);
        ll.addInFirst(50);
        ll.addInLast(23);
        ll.displayLL();
    }
}
