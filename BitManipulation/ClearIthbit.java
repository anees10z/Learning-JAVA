package BitManipulation;

public class ClearIthbit {
    public static void main(String[] args) {
        int n = 10; 
        int i = 1;
        int bitMask = ~(1 << i);
        int newNumber = n & bitMask;
        System.out.println(newNumber);
    }
}
