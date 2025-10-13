package Recursion;

public class Factorial {
    // tail recursion technique
    public static int fact(int n, int fact) {
        if (n == 0 || n == 1)
            return fact;
        fact *= n;
        return fact(n - 1, fact);
    }

    public static int fact(int n) {
        if (n == 0 || n == 1)
            return 1;
        return n * fact(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(fact(3));
        System.out.println(fact(3,1));
    }
}
