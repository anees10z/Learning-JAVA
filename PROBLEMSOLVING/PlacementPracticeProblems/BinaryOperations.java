package PROBLEMSOLVING.PlacementPracticeProblems;

// Problem Description :
// The Binary number system only uses two digits, 0 and 1 and number system can be called binary string. You are required to implement the following function:

// int OperationsBinaryString(char* str);

// The function accepts a string str as its argument. The string str consists of binary digits separated with an alphabet as follows:

// – A denotes AND operation
// – B denotes OR operation
// – C denotes XOR Operation
// You are required to calculate the result of the string str, scanning the string to right taking one opearation at a time, and return the same.

// Note:

// No order of priorities of operations is required
// Length of str is odd
// If str is NULL or None (in case of Python), return -1
// Input: str: 1C0C1C1A0B1

// Output: 1

// Explanation:
// The alphabets in str when expanded becomes “1 XOR 0 XOR 1 XOR 1 AND 0 OR 1”, result of the expression becomes 1, hence 1 is returned.

// Sample Input: 0C1A1B1C1C1B0A0

// Output: 0

public class BinaryOperations {
    public static int OperationsBinaryString(String str) {
        if (str == null)
            return -1;
        int len = str.length();
        if (len % 2 == 0)
            return -1;
        int ans = str.charAt(0) - '0';

        for (int i = 1; i < len; i += 2) {
            char curr = str.charAt(i);
            char nextNum = str.charAt(i + 1);
            if (nextNum != '1' && nextNum != '0') {
                return -1;
            }
            if (curr == 'A') {
                ans = ans & nextNum - '0';
            } else if (curr == 'B') {
                ans = ans | nextNum - '0';
            } else if (curr == 'C') {
                ans = ans ^ nextNum - '0';
            } else {
                return -1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        // Rules: A = AND, B = OR, C = XOR, and length of str must be odd start and end
        // with 0 and 1 only
        // String str = "1C0C1C1A0B1";
        String str = "0C1A1B1C1C1B0A0";
        // String str = null;
        System.out.println("Ans: " + OperationsBinaryString(str));
    }
}
