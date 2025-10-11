package Recursion;

public class sumOf1stNnaturalNums {
    public static void sum(int i, int n, int sum) {
        if (i == n) { // base case
            sum += i;
            System.out.println("Sum = " + sum);
            return;
        }
        sum += i;
        sum(i + 1, n, sum); // recursion
    }

    public static void main(String[] args) {
        sum(0, 5, 0);
    }
}
