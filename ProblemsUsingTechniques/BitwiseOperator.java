package ProblemsUsingTechniques;

public class BitwiseOperator {
    public static void main(String[] args) {
        // check for even odd
        int num = 7;
        if ((num & 1) == 0)
            System.out.println("Even");
        else {
            System.out.println("Odd");
        }

        // Swap Two Numbers Without Temp Variable
        int a = 5, b = 7;
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        System.out.println("a = " + a + ", b = " + b);

        // Find Unique Element in Array (XOR trick)
        int[] arr = { 2, 3, 5, 4, 5, 3, 2 };
        int res = 0;
        for (int x : arr) {
            res ^= x;
        }
        System.out.println("Unique element: " + res); // 4

        // Multiply or Divide by 2 Quickly
        int num1 = 8;
        System.out.println(num1 << 1); // 16 (multiply by 2)
        System.out.println(num1 >> 1); // 4 (divide by 2)
    }
}
/*
&, |, ^, ~, <<, >>, >>> are bitwise operators.

Use cases:

Even/odd check

Fast multiply/divide

Unique element detection

Encryption & compression

Permission systems / flags

Networking (IP masking)
 */
