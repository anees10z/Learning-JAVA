package PROBLEMSOLVING.PlacementPracticeProblems;

// constraint
// 1 <= nums[i] <= 100
// nums.length <= 100
// Sort these values in must O(n)
public class SortIn_O_n {
    public static void main(String[] args) {
        // counting sort
        int[] nums = {
                42, 7, 95, 23, 61, 7, 88, 14, 53, 29,
                100, 36, 61, 2, 74, 45, 19, 83, 53, 11,
                67, 31, 90, 4, 76, 22, 45, 98, 15, 64,
                39, 82, 1, 57, 24, 73, 11, 94, 50, 28,
                69, 33, 87, 16, 65, 72, 5, 92, 41, 60, 25,
                78, 13, 55, 99, 34, 68, 21, 85, 47, 9,
                63, 30, 96, 18, 71, 43, 6, 80, 52, 27,
                89, 12, 66, 35, 93, 20, 58, 44, 75, 3, 100
        };
        int[] freq = new int[101];
        for (int num : nums) {
            freq[num]++;
        }
        int i = 0;
        for (int j = 1; j <= 100; j++) {
            while (freq[j] > 0) {
                nums[i++] = j;
                freq[j]--;
            }
        }
        for (int el : nums) {
            System.out.print(el + " ");
        }
        System.out.println();
    }
}
