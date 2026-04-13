package Basics;

public class Operators {
    public static void main(String[] args) {
        int a = 10, b = 5;

        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));

        System.out.println("Equal: " + (a == b));
        System.out.println("Not Equal: " + (a != b));

        System.out.println("AND: " + (a > 5 && b < 10));
        System.out.println("OR: " + (a > 5 || b > 10));
    }
}