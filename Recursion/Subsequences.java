package Recursion;
// O(2^n)
public class Subsequences {

    public static int count = 0; // to count total number of subsequence 

    public static void subsequences(String str, int index, String newString){
        // base case
        if(index==str.length())
        {
            count++;
            System.out.println(newString);
            return;
        }

        // current char to be in sequence
        subsequences(str, index+1, newString+str.charAt(index));

        // current char not to be in sequence
        subsequences(str, index+1, newString);
    }

    public static void main(String[] args) {
        String str = "abc";
        subsequences(str, 0, "");
        System.out.println("\nTotal number of subsequences = "+ count);
    }
}
