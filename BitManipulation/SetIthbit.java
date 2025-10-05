package BitManipulation;

public class SetIthbit {
    public static void main(String[] args) {
        int n = 10; 
        int i = 2;
        int bitMask = 1 << i;
        int newNumber = n | bitMask;
        System.out.println(newNumber);
    }
}
