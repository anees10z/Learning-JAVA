package SimpleTasks;

// import java.util.*;

public class LargestNumber {
    public static int largestNum(int nums[]) {
        int largest = Integer.MIN_VALUE; // Integer.MAX_VALUE; 
        for (int x : nums) {
            if (x > largest)
                largest = x;
        }
        return largest;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 4, 3, 9, 3, 9, 6, 109, 32 };
        System.out.println("Largest number = " + largestNum(nums));
    }
}
