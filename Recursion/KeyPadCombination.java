package Recursion;

public class KeyPadCombination {
    public static String[] keypad = { ".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz" };

    public static void printCombinations(String numberCombination, int index, String combination) {
        // base case
        if (index == numberCombination.length()) {
            System.out.println(combination);
            return;
        }

        char CurrentChar = numberCombination.charAt(index);
        String mapping = keypad[CurrentChar - '0']; // if 1 then combination takes from keypad "abc"
        for (int i = 0; i < mapping.length(); i++) {
            printCombinations(numberCombination, index + 1, combination + mapping.charAt(i));
        }
    }

    public static void main(String[] args) { // O(4^n)
        String numberCombination = "12";
        printCombinations(numberCombination, 0, "");
    }
}
