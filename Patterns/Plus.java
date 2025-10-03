package Patterns;

/*
  *
  * 
*****
  *
  * 
 */
public class Plus {
    public static void plus(int n) {
        int mid = (n / 2) + 1;
        for (int i = 1; i <= n; ++i) {
            for (int j = 1; j <= n; ++j) {
                if(i==mid || j==mid){
                    System.out.print('*');
                }else{
                    System.out.print(' ');
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        plus(5);
    }
}
