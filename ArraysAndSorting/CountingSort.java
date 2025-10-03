package ArraysAndSorting;

public class CountingSort {
    public static void countingSort(int arr[]) {
        int largest= Integer.MIN_VALUE;
        for(int i:arr){
            largest= Math.max(largest, i);
        }
        int frequency[] = new int[largest+1];
        // for (int i = 0; i < frequency.length; ++i) {
        //     frequency[i] = 0;
        // }
        
        // Counting Frequency
        for (int i = 0; i < arr.length; ++i) {
            frequency[arr[i]]++;
        }
        // Print frequency
        System.out.println("\nFrequency: ");
        for (int i : frequency) {
            System.out.print(i + " ");
        }
        System.out.println();
        // Sorting according to frequency
        int k = 0;
        for (int i = 0; i < frequency.length; i++) {
            while (frequency[i] > 0) {
                arr[k++] = i;
                frequency[i]--;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 7, 2, 1, 4, 7, 3, 1, 2, 4, 5 };
        countingSort(arr);
        System.out.println("\nSorted numbers: ");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
