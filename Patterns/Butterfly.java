package Patterns;
/*
*      *
**    **
***  ***
********
********
***  ***
**    **
*      *
 */

public class Butterfly {
    public static void butterflyPt(int n) {
        // first half
        for (int i = 1; i <= n; i++) {
            // stars = i
            for (int j = 1; j <= i; ++j) {
                System.out.print("*");
            }
            // space = 2x(n-i)
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // stars = i
            for (int j = 1; j <= i; ++j) {
                System.out.print("*");
            }
            System.out.println();
        }
        // 2nd half
        for (int i = n; i >= 1; i--) {
            // stars = i
            for (int j = 1; j <= i; ++j) {
                System.out.print("*");
            }
            // space = 2x(n-i)
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // stars = i
            for (int j = 1; j <= i; ++j) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        butterflyPt(4);
    }
}
