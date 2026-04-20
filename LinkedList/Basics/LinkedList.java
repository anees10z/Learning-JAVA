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

    // Methods for LinkedList Operations
    // Add node in first
    public void addInFirst(int data) {
        // step-1 Create new Node
        Node newNode = new Node(data);
        size++;
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

    // remove 1st node
    public void removeFirst() {
        // edge case-1
        if (size == 0) {
            System.out.println("List is empty");
            return;
        }
        // edge case-2
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
        Node temp;
        Node prev = null;
        temp = head;
        while (temp.next != null) {
            prev = temp;
            temp = temp.next;
        }
        System.out.println("Deleted: " + tail.data);
        tail = prev;
        size--;
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

    // search for element in a LL iteratively
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

    // search for element in a LL Recursively
    public int helper(Node temp, int target) {
        if (temp == null) {
            return -1;
        }
        if (temp.data == target) {
            return 0;
        }
        int idx = helper(temp.next, target);
        if (idx == -1) {
            return -1;
        }
        return idx + 1;
    }

    public int recursiveSearch(int target) {
        return helper(head, target);
    }

    // Main Function
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        // apna object bana le (example: LinkedList)
        LinkedList list = new LinkedList();

        System.out.println("\n===== MENU =====");
        System.out.println("1. Add element at first");
        System.out.println("2. Add element at last");
        System.out.println("3. Add element in middle");
        System.out.println("4. Delete first element");
        System.out.println("5. Delete last element");
        System.out.println("6. Display list");
        System.out.println("7. Display size of list");
        System.out.println("8. Search for an element Linearly");
        System.out.println("9. Search for an element Recursively");
        System.out.println("10. Exit");

        do {
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter value: ");
                    int val1 = sc.nextInt();
                    list.addInFirst(val1);
                    break;

                case 2:
                    System.out.print("Enter value: ");
                    int val2 = sc.nextInt();
                    list.addInLast(val2);
                    break;
                case 3:
                    System.out.print("Enter value: ");
                    int val3 = sc.nextInt();
                    System.out.print("Enter index: ");
                    int index = sc.nextInt();
                    list.addInMiddle(index, val3);
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
                    System.out.println(size);
                    break;

                case 8:
                    System.out.print("Enter target: ");
                    int target = sc.nextInt();
                    int idx = list.searchforElement(target);
                    if (idx == -1) {
                        System.out.println("Element not Exists");
                    } else {
                        System.out.println("Element present at: " + idx);
                    }
                    break;

                case 9:
                    System.out.print("Enter target: ");
                    int recTarget = sc.nextInt();
                    int idx2 = list.recursiveSearch(recTarget);
                    if (idx2 == -1) {
                        System.out.println("Element not Exists");
                    } else {
                        System.out.println("Element present at: " + idx2);
                    }
                    break;

                case 10:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice, try again!");
            }

        } while (choice != 10);

        sc.close();
    }
}
