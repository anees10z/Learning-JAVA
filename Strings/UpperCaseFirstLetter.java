package Strings;

// For a given string convert each the first letter of each word to uppercase
public class UpperCaseFirstLetter {
    public static String upperCase(String str) {
        StringBuilder sb = new StringBuilder("");

        sb.append(Character.toUpperCase(str.charAt(0)));

        for (int i = 1; i < str.length(); ++i) {
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String str = new String("i am md anees khan");
        //String str1 = new String(" i am md anees khan"); check for this input 1st place = space
        System.out.println(upperCase(str));
    }
}
