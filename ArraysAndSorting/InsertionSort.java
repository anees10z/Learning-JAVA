package ArraysAndSorting;

public class InsertionSort {
    public static void insertionSort(int nums[]) {   // O(n^2)
        for (int i = 1; i < nums.length; ++i) {
            int temp = nums[i];
            int j = i-1;
            // for (j = i - 1; j >= 0; j--) {
            //     if (nums[j] > temp) {
            //         nums[j + 1] = nums[j];
            //     } else { // if nums[j]<temp then we find the correct position then break and fill value
            //         break;     // at right position
            //     }
            // }
            while (j >= 0 && nums[j] > temp) {
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = temp;
        }
    }

    public static void main(String[] args) {
        int[] nums = { 7, 2, 1, 9, 3, 2, 5 };
        insertionSort(nums);
        System.out.println("\nSorted numbers: ");
        for (int x : nums) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}
