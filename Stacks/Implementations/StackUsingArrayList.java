package Stacks.Implementations;

import java.util.ArrayList;

public class StackUsingArrayList {
    static class Stack {
        static ArrayList<Integer> list = new ArrayList<>();

        public boolean isEmpty() {
            return list.size() == 0;
        }

        public void push(int n) {
            list.add(n);
        }

        public int pop() {
            if (isEmpty()) {
                return -1;
            }
            int top = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return top;
        }

        public int peek() {
            if (isEmpty()) {
                return -1;
            }
            return list.get(list.size() - 1);
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
