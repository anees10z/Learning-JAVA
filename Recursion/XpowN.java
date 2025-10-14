package Recursion;

public class XpowN { // Stack height -> O(n)
    public static int pow(int x, int n) {
        if (n == 0) // 1st base case
            return 1;
        if (x == 0) // 2nd best case
            return 0;
        // if n is -ve then use this    
        /*if(x<0)
            return 1/pow(x, -n);  */
        int xPowN1 = pow(x, n - 1);
        return x*xPowN1;
    }

    public static void main(String[] args) {
        // test case values -> x = {2,3,0,-2,-3....} and n = {0,1,2,3,4,-ve values}
        int x = 2, n = 5;
        System.out.println(pow(x, n));
    }
}
