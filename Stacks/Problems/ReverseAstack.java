package Stacks.Problems;

import java.util.Stack;

public class ReverseAstack {
    public static void insertAtBottom(Stack<Integer> s, int data) {
        if (s.empty()) {
            s.push(data);
            return;
        }
        int n = s.pop();
        insertAtBottom(s, data);
        s.push(n);
    }

    public static void reverseStack(Stack<Integer> s) {
        if (s.empty()) {
            return;
        }
        int n = s.pop();
        reverseStack(s);
        insertAtBottom(s, n);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.add(1);
        st.add(2);
        st.add(3);
        System.out.println("size :" + st.size());
        reverseStack(st);

        while (!st.isEmpty()) {
            System.out.println(st.peek());
            st.pop();
        }
    }
}
