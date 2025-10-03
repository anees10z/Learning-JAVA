package ArraysAndSorting;

import java.util.Scanner;

// Time complexity O(n)
public class LinearSearch {
    public static int linearSearch(String arr[], String key) {
        for (int i = 0; i < arr.length; ++i) {
            if (arr[i].equals(key)) {
                return i;
            }
        }
        return -1;
    }

    public static void ls(String arr[], String key) {
        int i = 0, j = arr.length - 1;
        System.out.println("\nOptimized Linear Search ");
        System.out.println("Linear search using two pointers: ");
        while (i <= j) {
            if (arr[i].equals(key) || arr[j].equals(key)) {
                System.out.println("Mil gya bhai");
                break;
            } else {
                i++;
                j--;
            }
        }
        System.out.println("Nhi mila bhai");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String items[] = { "samosa", "pakodi", "kachori", "dosa" };
        System.out.print("Kya chahiye aapko: ");
        String key = sc.nextLine();
        sc.close();
        int index = linearSearch(items, key);
        if (index == -1) {
            System.out.println(key + " nahi hai yaar...!");
        } else {
            System.out.println(key + " mil gya index " + index + " pe");
        }
        ls(items, key);
    }
}
