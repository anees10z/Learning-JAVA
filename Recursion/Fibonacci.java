package Recursion;

public class Fibonacci {
    public static void fib(int n, int a, int b) {
        if (n == 0)
            return;
        System.out.println(a + b);
        fib(n - 1, b, a + b);
    }

    public static int fib(int n) {
        if (n <= 1)
            return n;
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        int a = 0, b = 1;
        System.out.println(a);
        System.out.println(b);
        fib(5 - 2, a, b);
        System.out.println(fib(3));
    }
}
