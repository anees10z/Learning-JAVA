package Stacks.Implementations;

import java.util.Stack;

public class StackUsingJCF {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(23);
        st.push(3);
        System.out.println(st.search(23));

        while (!st.isEmpty()) {
            System.out.println(st.peek());
            st.pop();
        }
    }
}
