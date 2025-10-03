package Patterns;
/*
    *
   **
  ***
 ****
 */

public class HalfPyramid {
    public static void HlfPy(int row, int col) {
        for (int i = 0; i < row; ++i) {
            for (int j = 0; j < col - i; ++j) { // for spaces
                System.out.print(" ");
            }
            for (int j = 0; j <= i; ++j) {  // for stars
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        HlfPy(4, 4);
    }
}
