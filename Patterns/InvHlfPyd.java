package Patterns;
/*
****
***
**
*
 */
public class InvHlfPyd {
    public static void inverted(int row, int col){
        for(int i=0;i<row;++i){
            for(int j=col-i;j>0;--j){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        inverted(4, 4);
    }
}
