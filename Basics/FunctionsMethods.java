package Basics;

public class FunctionsMethods {

    public static int add(int a, int b) {
        return a + b;
    }

    public static void greet() {
        System.out.println("Hello, Welcome!");
    }

    public static void main(String[] args) {
        greet();
        int result = add(5, 10);
        System.out.println("Sum: " + result);
    }
}
