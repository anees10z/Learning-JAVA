package PROBLEMSOLVING.PlacementPracticeProblems;

// You are given a function.
// int CheckPassword(char str[], int n);
// The function accepts string str of size n as an argument. Implement the function which returns 1 if given string str is valid password else 0.
// str is a valid password if it satisfies the below conditions.

// – At least 4 characters
// – At least one numeric digit
// – At Least one Capital Letter
// – Must not have space or slash (/)
// – Starting character must not be a number
// Assumption:
// Input string will not be empty.

// Example:

// Input 1: aA1_67     Output 1: 1
// Input 2: a987 abC012   Output 2: 0

public class PasswordChecker {
    public static int checkPassWord(String password) {
        int len = password.length();
        if (len < 4)
            return 0;
        if (password.charAt(0) >= '0' && password.charAt(0) <= '9')
            return 0;

        boolean digit = false;
        boolean capital = false;

        for (int i = 0; i < len; i++) {
            char curr = password.charAt(i);
            if (curr == ' ' || curr == '/')
                return 0;
            else if (curr >= 'A' && curr <= 'Z') {
                capital = true;
            } else if (curr >= '0' && curr <= '9') {
                digit = true;
            }
        }

        if (!capital || !digit)
            return 0;
        return 1;
    }

    public static void main(String[] args) {
        // String password = "aA1_67";
        String password = "9Aa987abC012";
        System.out.println("Result: " + checkPassWord(password));
    }
}
