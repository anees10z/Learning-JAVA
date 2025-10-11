package BitManipulation;

public class PowerOfTwo {
    // Returns true if n is a power of two
    public static boolean isPowerOfTwo(int n) {
        if (n <= 0) return false;
        return (n & (n - 1)) == 0;
    }
    public static void main(String[] args) {
        int n = 16; // Example input
        System.out.println(n + " is power of two: " + isPowerOfTwo(n));
    }

}