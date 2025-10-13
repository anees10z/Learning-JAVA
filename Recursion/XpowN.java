package Recursion;

public class XpowN {
    public static int pow(int x, int n) {
        if (n == 0) // 1st base case
            return 1;
        if (x == 0) // 2nd best case
            return 0;
        return x * pow(x, n - 1);
    }

    public static void main(String[] args) {
        int x = 2, n = 5;
        System.out.println(pow(x, n));
    }
}
