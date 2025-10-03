package BitManipulation;

import java.util.*; 

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        sc.close();
        if ((a & 1) == 0) {
            System.out.println(a + " is Even");
        } else {
            System.out.println(a + " is Odd");
        }
    }
}
