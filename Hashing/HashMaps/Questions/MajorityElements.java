package Questions;

import java.util.HashMap;
import java.util.HashSet;

public class MajorityElements {
    public static HashSet<Integer> majorityElement(int[] nums) {
        HashSet<Integer> result = new HashSet<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int len = nums.length;

        // Frequency count
        for (int i = 0; i < len; ++i) {
            int num = nums[i];
            map.put(num, map.getOrDefault(num, 0) + 1);

            // also use below code for frequency count;
            // if (map.containsKey(num)) {
            // map.put(num, map.get(num) + 1);
            // } else {
            // map.put(num, 1);
            // }
        }

        for (int key : map.keySet()) {
            if (map.get(key) > len / 3) {
                result.add(key);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        // int[] nums = { 1, 3, 2, 5, 1, 3, 1, 5, 1 };
        int[] nums = { 1, 3};

        HashSet<Integer> result = majorityElement(nums);

        System.out.println("Majority elements: " + result);
    }
}