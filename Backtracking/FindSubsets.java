package Backtracking;

public class FindSubsets {
    public static void subSets(String s, String ans, int idx) {
        // base case
        if (idx == s.length()) {
            if (ans.length() == 0) {
                System.out.println("null");
            }
            System.out.println(ans);
            return;
        }
        // Recursion
        // Choice Yes
        subSets(s, ans + s.charAt(idx), idx + 1);
        // Choice No BackTrack
        subSets(s, ans, idx + 1);
    }

    public static void main(String[] args) {
        String str = "abc";
        String ans = "";

        subSets(str, ans, 0);
    }
}
