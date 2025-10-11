package Recursion;

// Print 1 to 5 using recursion
public class BasicRescursion {
    public static void printNums(int n) {
        if (n == 6)  // base case
            return;
        System.out.println(n);
        printNums(n + 1); // function call itself (recursion)

    }

    public static void main(String[] args) {
        printNums(1);
    }
}
