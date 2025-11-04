public class StringReverse{
    public static void rev(String s, int n){
        if(n == 0){
            System.out.print(s.charAt(n));
            return;
        }
        System.out.print(s.charAt(n));
        rev(s, n-1);
    }
    public static void main(String[] args){
        String str = "abcd";
        rev(str, str.length() - 1);
    }
}
