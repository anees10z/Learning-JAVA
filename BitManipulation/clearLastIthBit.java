package BitManipulation;

public class clearLastIthBit {
    public static void main(String[] args) {
        int n = 15;
        int ith = 2;
        // for (int i = 0; i < ith; ++i) {
        //     int bitMask = 1 << i;
        //     n = n & ~(bitMask);
        // }
        int bitMask = (~0) << ith;
        System.out.println("res: " + (n & bitMask));
    }
}
