package Stacks.Problems;

import java.util.Stack;

public class NextGreaterElementOnRight {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        // int[] arr = { 8, 12, 0, 16, 2, 1 };
        int[] arr = { 6, 8, 0, 1, 3 };
        int[] nextGreater = new int[arr.length];

        for (int i = arr.length - 1; i >= 0; --i) {
            // 1st step
            while (!st.empty() && st.peek() <= arr[i]) {
                st.pop();
            }
            // 2nd step
            if (st.empty()) {
                nextGreater[i] = -1;
            } else {
                nextGreater[i] = st.peek();
            }
            // 3rd step
            st.push(arr[i]);
        }

        for (int i : nextGreater) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
