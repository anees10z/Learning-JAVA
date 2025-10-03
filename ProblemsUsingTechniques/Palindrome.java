package ProblemsUsingTechniques;

// check for palindrome using Two Pointer technique -> O(n)
public class Palindrome {
    public static void palindromeCheck(String s) {
        boolean flag = true;
        int l = 0, r = s.length() - 1;
        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(l) == s.charAt(r)) { // charAt(index) used for access String index values
                l++;
                r--;
            } else {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println(s + " is Palindrome");
        } else {
            System.out.println(s + " is not Palindrome");
        }
    }

    public static void main(String[] args) {
        int num = 12213;
        int num1= 123;
        String s =num1+""; // typpe casting
        String str = "bob";
        palindromeCheck(String.valueOf(num));
        palindromeCheck(str);
        palindromeCheck(s);
    }
}
