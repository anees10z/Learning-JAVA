package Recursion;

public class XpowNstLogn {
    // stack height -> O(logn)
    public static int pow(int x, int n) {
        if (n == 0) // 1st base case
            return 1;
        if (x == 0) // 2nd best case
            return 0;
        // if n is even
        if (n % 2 == 0)
            return pow(x, n / 2) * pow(x, n / 2);
        else // if n is odd
            return pow(x, n / 2) * pow(x, n / 2) * x;
    }

    public static void main(String[] args) {
        // test case values -> x = {2,3,0,-2,-3....} and n = {0,1,2,3,4}
        int x = -2, n = 8;
        System.out.println(pow(x, n));
    }
}
