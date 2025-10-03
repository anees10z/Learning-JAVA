package ArraysAndSorting;

public class ReverseAnArray {
    // by using two pointer technique
    public static int[] revArray(int[] arr) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 4, 6, 5, 2, 3, 9 };
        revArray(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
