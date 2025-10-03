package ArraysAndSorting;

public class BubbleSort {
    public static void bubbleSort(int arr[]) {   // O(n^2)
        for (int i = 0; i < arr.length; ++i) {
            int swap = 0;
            for (int j = 0; j < arr.length - i - 1; ++j) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap++;
                }
            }

            if (swap == 0) {
                System.out.println("Already sorted at pass: "+ (i+1));
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
        bubbleSort(arr);
        System.out.println("Sorted elements : ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
