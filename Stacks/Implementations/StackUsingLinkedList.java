package Stacks.Implementations;

public class StackUsingLinkedList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Stack {
        static Node top = null;

        public boolean isEmpty() {
            return top == null ;

        }

        public void push(int n) {
            Node newNode = new Node(n);
            if (top == null) {
                top = newNode;
                return;
            }
            newNode.next = top;
            top = newNode;
        }

        public int pop() {
            if (isEmpty()) {
                return -1;
            }
            int data = top.data;
            top = top.next;
            return data;
        }

        public int peek() {
            if (isEmpty()) {
                return -1;
            }
            return top.data;
        }

    }

    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(23);
        st.push(3);
        st.push(5);
        st.push(90);
        st.push(12);
        while (!st.isEmpty()) {
            System.out.println(st.peek());
            st.pop();
        }
    }
}
