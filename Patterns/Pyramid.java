package Patterns;

/*
   *
  ***
 *****
*******
*******
 *****
  ***
   *
 */
public class Pyramid {
    public static void pyramid(int n) {
        // 1st Half
        for (int i = 1; i <= n; ++i) {
            for (int j = 1; j <= n - i; ++j) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // 2nd Half
        for (int i = n; i >= 1; --i) {
            for (int j = 1; j <= n - i; ++j) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i) - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pyramid(4);
    }
}