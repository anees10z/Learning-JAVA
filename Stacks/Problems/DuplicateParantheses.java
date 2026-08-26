package Stacks.Problems;

import java.util.Stack;

public class DuplicateParantheses {
    public static boolean isDuplicate(String str) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < str.length(); ++i) {
            char curr = str.charAt(i);
            if (curr != ')') {
                st.push(curr); // opening, operand, operator
            } else if (curr == ')') {
                int count = 0;
                while (st.peek() != '(') {
                    st.pop();
                    count++;
                }
                if (count < 1) {
                    return true;// duplicate
                } else {
                    st.pop();
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String str = "((a-b))";
        boolean res = isDuplicate(str);
        System.out.println(res);
    }
}
