package ArraysAndSorting;

public class SelectionSort { 
    public static void selectionSort(int nums[]) { // O(n^2)
        for (int i = 0; i < nums.length - 1; ++i) {
            int min = i;
            for (int j = i + 1; j < nums.length; ++j) {
                if (nums[j] < nums[min]) {
                    min = j;
                }
            }
            int temp = nums[i];
            nums[i] = nums[min];
            nums[min] = temp;
        }
    }

    public static void main(String[] args) {
        int[] nums = { 33, 1, 5, 2, 4 };
        selectionSort(nums);
        System.out.println("Sorted elements: ");
        for (int i : nums) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
