package SimpleTasks;
public class Decimal2Binary {
    public static String d2b1st(int n) {
        // 1st Method
        StringBuilder res = new StringBuilder();
        int x;
        while(n>0){
            x=n%2;
            res.insert(0,x); // insert at index 0 each time
            n=n/2;
        }
        return res.toString();
    }
    public static int d2b2nd(int n){
        int bNum=0;
        int pow=0;
        int rem;
        while(n>0){
            rem=n%2;
            bNum=bNum + (rem* (int)Math.pow(10, pow++));
            n=n/2;
        }
        return bNum;
    }
    public static void main(String[] args) {
        System.out.println("Binary: " + d2b1st(5));
        System.out.println("Binary: " + d2b2nd(13));
    }
}
