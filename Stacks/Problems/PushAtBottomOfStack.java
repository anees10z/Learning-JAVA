package Stacks.Problems;

import java.util.Stack;

public class PushAtBottomOfStack {
    public static void insertAtBottom(Stack<Integer> s, int data) {
        if (s.empty()) {
            s.push(data);
            return;
        }
        int n = s.pop();
        insertAtBottom(s, data);
        s.push(n);
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.add(1);
        st.add(2);
        st.add(3);

        insertAtBottom(st, 4);

        while (!st.isEmpty()) {
            System.out.println(st.peek());
            st.pop();
        }
    }
}
