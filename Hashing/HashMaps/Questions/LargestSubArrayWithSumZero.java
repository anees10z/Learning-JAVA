package Questions;

import java.util.HashMap;

public class LargestSubArrayWithSumZero {
    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // int[] arr = { 15, -2, 2, -8, 1, 7, 10, 23 };
        // int[] arr = {3, 4, 5};
        int[] arr = { 3, -1, -2, 8, -2, -1, -1, -2, -1 };

        int sum = 0;
        int len = 0;

        for (int j = 0; j < arr.length; j++) {
            sum = sum + arr[j];
            if (sum == 0) {
                len = Math.max(len, j + 1);
            }
            if (map.containsKey(sum)) {
                len = Math.max(len, j - map.get(sum));
            } else {
                map.put(sum, j);
            }
        }

        System.out.println("Largest Subarray length: " + len);
    }
}
