package Recursion;
// Find the 1st & last occurance of an element in a given String?
public class FirstLastOccurOfElemInStr {
    public static int first = -1, last = -1;

    public static void checkOccurance(String str, int index, char ch) {
        if (index == str.length())
            return;
        if (str.charAt(index) == ch) {
            if (first == -1) {
                first = index;
                last = index;
            } else
                last = index;
        }
        checkOccurance(str, index+1, ch);
    }

    public static void main(String[] args) {
        // O(n)
        String str = "abaacdaefaah";
        char element = 'a';
        checkOccurance(str, 0, element);
        System.out.println("First = "+ first+ " Last = "+ last);
    }
}
