package BitManipulation;


public class UpdateIthBit {
    public static int updateBit(int n, int ith, boolean update) {
        int bitMask;
        if (update == true) {
            bitMask = (1 << ith);
            return n | bitMask;
        } else {
            bitMask = ~(1 << ith);
            return n & bitMask;
        }

        // Another method
        /* 
            n = clearithbit(n,i);
            int bitmask = updatebit << i;
            return n | bitmask;
        */
    }

    public static void main(String[] args) {
        int n = 10;
        int ith = 0;
        boolean update = true;
        System.out.println(updateBit(n, ith, update));
        System.out.println(updateBit(n, 1, false));
    }
}
