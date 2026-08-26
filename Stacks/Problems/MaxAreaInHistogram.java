package Stacks.Problems;

import java.util.Stack;

public class MaxAreaInHistogram {
    public static int[] nextSmallerLeft(int[] heights) {
        int[] nextSmallerleft = new int[heights.length];
        int len = heights.length;
        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < len; ++i) {
            while (!st.empty() && heights[st.peek()] >= heights[i]) {
                st.pop();
            }
            if (st.empty()) {
                nextSmallerleft[i] = -1;
            } else {
                nextSmallerleft[i] = st.peek();
            }
            st.push(i);
        }

        return nextSmallerleft;
    }

    public static int[] nextSmallerRight(int[] heights) {
        int[] nextSmallerRight = new int[heights.length];
        int len = heights.length;
        Stack<Integer> st = new Stack<>();
        for (int i = len - 1; i >= 0; --i) {
            while (!st.empty() && heights[st.peek()] >= heights[i]) {
                st.pop();
            }
            if (st.empty()) {
                nextSmallerRight[i] = len;
            } else {
                nextSmallerRight[i] = st.peek();
            }
            st.push(i);
        }
        return nextSmallerRight;
    }

    public static int maxArea(int[] heights, int[] nextSmallerLeft, int[] nextSmallerRight) {
        int max = 0;
        for (int i = 0; i < heights.length; i++) {
            int l = nextSmallerLeft[i];
            int r = nextSmallerRight[i];
            int area = heights[i] * (r - l - 1);
            if (area > max) {
                max = area;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        // int[] heights = { 2, 1, 5, 6, 2, 3 };
        int[] heights = { 2, 4 };

        int[] nextSmallerleft = nextSmallerLeft(heights);
        int[] nextSmallerRight = nextSmallerRight(heights);
        int res = maxArea(heights, nextSmallerleft, nextSmallerRight);
        System.out.println(res);
    }
}
