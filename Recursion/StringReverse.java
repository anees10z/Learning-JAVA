package Recursion;
// Reverse the given String
public class StringReverse{
    public static void rev(String s, int n, StringBuilder sb){
        if(n == 0){
            sb.append(s.charAt(n));
            return;
        }
        sb.append(s.charAt(n));
        rev(s, n-1,sb);
    }
    public static void main(String[] args){
        // O(n)
        String str = "abcd";
        StringBuilder sb = new StringBuilder();
        rev(str, str.length() - 1, sb);
        System.out.println(sb.toString());
    }
}
