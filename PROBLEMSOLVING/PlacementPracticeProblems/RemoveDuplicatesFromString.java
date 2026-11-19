package PROBLEMSOLVING.PlacementPracticeProblems;

// str: "abbccda" -> "abcd"

public class RemoveDuplicatesFromString {
    public static void main(String[] args) {
        String s = "abbccda";
        int len = s.length();
        boolean[] seen = new boolean[26];
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < len; i++) {
            char curr = s.charAt(i);

            if (!seen[curr - 'a']) {
                seen[curr - 'a'] = true;
                sb.append(curr);
            }
        }

        System.out.println(sb.toString());
    }
}
