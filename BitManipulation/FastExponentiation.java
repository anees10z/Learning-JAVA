package BitManipulation;

public class FastExponentiation {
    public static int fastExpo(int num, int pow) {
        int res = 1;
        while (pow > 0) {
            if ((pow & 1) != 0) { // check LSB (if 1 then multiply)
                res = res * num;
            }
            num = num * num;
            pow = pow >> 1; // right shift by 1
        }
        return res;
    }

    public static void main(String[] args) {
        int num = 2;
        int pow = 7;
        System.out.println("Res = " + fastExpo(num, pow));
    }
}
