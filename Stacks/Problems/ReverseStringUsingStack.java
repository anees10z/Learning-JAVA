package Stacks.Problems;

import java.util.Stack;

public class ReverseStringUsingStack {
    public static void main(String[] args) {
        Stack<Character> s = new Stack<>();
        StringBuilder sb = new StringBuilder();
        String str = "Anees";
        for (int i = 0; i < str.length(); ++i) {
            s.push(str.charAt(i));
        }
        while (!s.empty()) {
            sb.append(s.pop());
        }
        System.out.println(sb.toString());
    }
}
