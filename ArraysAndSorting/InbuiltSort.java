package ArraysAndSorting;

import java.util.Arrays;
import java.util.Collections;

public class InbuiltSort {
    public static void print(int arr[]) {
        System.out.println("Sorted Elements: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void print(Integer arr[]) {
        System.out.println("Sorted Elements: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 6, 2, 5, 1, 4, 9 };
        Arrays.sort(arr); // O(nlogn)

        // if we want to sort on specific length like upto 4 elements
        // Arrays.sort(arr,0,4);
        print(arr);

        // if we want to sort in descending order by using Collection.reverseOrder()
        // reverseOrder() only works on object type variables like Integer not primitive
        // like (int)
        Integer arr1[] = { 6, 2, 5, 1, 4, 9 };
        Arrays.sort(arr1,Collections.reverseOrder());
        // Arrays.sort(arr1,0,4,Collections.reverseOrder());
        print(arr1);
    }
}
