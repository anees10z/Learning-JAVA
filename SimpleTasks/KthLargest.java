package SimpleTasks;

public class KthLargest {
    public static int partition(int arr[], int low, int high) {
        int i = low;
        int pivot = arr[high];

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i++] = temp;
            }
        }
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;

        return i;

    }

    public static void quickSelect(int[] arr, int low, int high, int targetIdx) {
        if (low <= high) {
            int pivotIdx = partition(arr, low, high);
            if (pivotIdx == targetIdx) {
                System.out.println(arr[pivotIdx]);
                return;
            } else if (targetIdx > pivotIdx)
                quickSelect(arr, pivotIdx + 1, high, targetIdx);
            else
                quickSelect(arr, low, pivotIdx - 1, targetIdx);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 2, 48, 4, 9, 2, 12, 3, 67, 12, 89, 90, 90, 46, 21 };
        int k = 2;
        int targetIdx = arr.length - k;
        quickSelect(arr, 0, arr.length - 1, targetIdx);
        // for (int num : arr) {
        // System.out.print(num + " ");
        // }
        // System.out.println();
    }

}
