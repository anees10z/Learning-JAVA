package Recursion;

// Move all 'x' to End of the string ("axbcxxd" --> "abcdxxx")
public class MoveAllXtoEnd {

    public static String moveAllXtoEnd(String str, int index, String newStr, int countX) {
        if (index == str.length()) { // base case
            for (int i = 0; i < countX; ++i) {
                newStr += 'x';
            }
            return newStr;
        }
        
        if (str.charAt(index) == 'x')
            countX++;
        else
            newStr += str.charAt(index);
        
        return moveAllXtoEnd(str, index+1, newStr, countX);
    }

    public static void main(String[] args) {
        String str = "axbcxxd";
        String newStr = "";
        int countX = 0;
        System.out.println(moveAllXtoEnd(str, 0, newStr, countX));
        
    }
}
