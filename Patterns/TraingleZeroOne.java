package Patterns;
/*
1
01
010
1010
10101
 */
public class TraingleZeroOne {
    public void ZeroOne(int n) {
        int counter = 1;
        for (int i = 1; i <= n; ++i) {
            for (int j = 1; j <= i; ++j) {
                // if ((i + j) % 2 != 0)
                //     System.out.print("0");
                // else
                //     System.out.print("1");
                System.out.print(counter);
                if (counter == 1)
                counter--;
                else
                counter++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        TraingleZeroOne tz = new TraingleZeroOne();
        tz.ZeroOne(5);
    }
}
