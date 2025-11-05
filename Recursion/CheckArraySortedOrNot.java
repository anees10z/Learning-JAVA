package Recursion;

// Check if an array is sorted(strictly increasing) -> [1,2,3 = true, 1,2,2 = false, 3,2,1 = false]
public class CheckArraySortedOrNot {

    public static boolean checkSorted(int[] arr, int index) {
        if (index == arr.length - 1)
            return true;

        if (arr[index] >= arr[index+1])
            return false;

        return checkSorted(arr, index + 1);
        // tail recursion
    }

    public static void main(String[] args) {
        // O(n)
        int[] arr = { -5, 6, 99, 106, 500 };
        System.out.println(checkSorted(arr, 0)); // function call 
    }
}
