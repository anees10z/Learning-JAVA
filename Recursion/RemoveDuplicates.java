package Recursion;

public class RemoveDuplicates {
    
    public static boolean[] charMap = new boolean[26];

    public static void removeDuplicates(String str, int index, String newString){
        // base case
        if(index==str.length()){
            System.out.println(newString);
            return;
        }

        if(charMap[str.charAt(index)-'a']==false){
            newString+=str.charAt(index);
            charMap[str.charAt(index)-'a'] = true;
        }

        removeDuplicates(str, index+1, newString);
    }

    public static void main(String[] args) {
        String str = "mdaneeskhan";
        removeDuplicates(str, 0, "");
    }
}
