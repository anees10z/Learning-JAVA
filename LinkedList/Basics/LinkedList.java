package LinkedList.Basics;

import java.util.Scanner;

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
    public static int size;

    // Add node in first
    public void addInFirst(int data) {
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    // Add node in last
    public void addInLast(int data) {
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    // Add node in Middle
    public void addInMiddle(int index, int data) {
        if (index <= 0) {
            System.out.println("Invalid index");
            return;
        }

        if (index == 1) {
            addInFirst(data);
            return;
        }

        Node temp = head;
        int i = 1;

        while (temp != null) {
            if (i == index - 1) {
                Node newNode = new Node(data);
                newNode.next = temp.next;
                temp.next = newNode;
                size++;
                return;
            }
            temp = temp.next;
            i++;
        }

        System.out.println("Index not found");
    }

    // remove first node
    public void removeFirst() {
        if (size == 0) {
            System.out.println("List is empty");
            return;
        }

        if (size == 1) {
            System.out.println("Deleted: " + head.data);
            head = tail = null;
            size--;
            return;
        }

        System.out.println("Deleted: " + head.data);
        head = head.next;
        size--;
    }

    // remove last node 
    public void removeLast() {
        if (size == 0) {
            System.out.println("List is empty");
            return;
        }

        if (size == 1) {
            System.out.println("Deleted: " + head.data);
            head = tail = null;
            size--;
            return;
        }

        Node temp = head;
        Node prev = null;

        while (temp.next != null) {
            prev = temp;
            temp = temp.next;
        }

        System.out.println("Deleted: " + tail.data);

        prev.next = null;   
        tail = prev;

        size--;
    }

    // display
    public void displayLL() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    // iterative search
    public int searchforElement(int target) {
        int index = 0;
        Node temp = head;

        while (temp != null) {
            if (temp.data == target) {
                return index;
            }
            temp = temp.next;
            index++;
        }

        return -1;
    }

    // recursive helper
    public int helper(Node temp, int target) {
        if (temp == null) return -1;

        if (temp.data == target) return 0;

        int idx = helper(temp.next, target);

        if (idx == -1) return -1;

        return idx + 1;
    }

    public int recursiveSearch(int target) {
        return helper(head, target);
    }

    // reverse LL iterative
    public void reverseLLiterative() {
        if (head == null || head.next == null) return;

        Node prev = null;
        Node curr = head;
        tail = head;

        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;

            prev = curr;
            curr = next;
        }

        head = prev;
    }

    // main
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        LinkedList list = new LinkedList();

        System.out.println("\n===== MENU =====");
        System.out.println("1. Add element at first");
        System.out.println("2. Add element at last");
        System.out.println("3. Add element in middle");
        System.out.println("4. Delete first element");
        System.out.println("5. Delete last element");
        System.out.println("6. Display list");
        System.out.println("7. Display size of list");
        System.out.println("8. Search (Linear)");
        System.out.println("9. Search (Recursive)");
        System.out.println("10. Reverse LL");
        System.out.println("11. Exit");

        do {
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter value: ");
                    list.addInFirst(sc.nextInt());
                    break;

                case 2:
                    System.out.print("Enter value: ");
                    list.addInLast(sc.nextInt());
                    break;

                case 3:
                    System.out.print("Enter value: ");
                    int val = sc.nextInt();
                    System.out.print("Enter index: ");
                    int idx = sc.nextInt();
                    list.addInMiddle(idx, val);
                    break;

                case 4:
                    list.removeFirst();
                    break;

                case 5:
                    list.removeLast();
                    break;

                case 6:
                    list.displayLL();
                    break;

                case 7:
                    System.out.println("Size: " + size);
                    break;

                case 8:
                    System.out.print("Enter target: ");
                    int t1 = sc.nextInt();
                    int res1 = list.searchforElement(t1);
                    System.out.println(res1 == -1 ? "Not Found" : "Found at: " + res1);
                    break;

                case 9:
                    System.out.print("Enter target: ");
                    int t2 = sc.nextInt();
                    int res2 = list.recursiveSearch(t2);
                    System.out.println(res2 == -1 ? "Not Found" : "Found at: " + res2);
                    break;

                case 10:
                    list.reverseLLiterative();
                    System.out.println("Reversed!");
                    break;

                case 11:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 11);

        sc.close();
    }
}