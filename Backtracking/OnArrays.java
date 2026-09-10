package Backtracking;

public class OnArrays {
    public static void backTrack(int[] arr, int val, int idx) {
        if (idx == arr.length) {
            return;
        }
        arr[idx] = val;
        backTrack(arr, val + 1, idx + 1); // fnx call step
        arr[idx] = arr[idx] - 2; // backtrack step
    }

    public static void main(String[] args) {
        int[] arr = new int[5];
        int val = 0;
        int i = 0;

        backTrack(arr, val + 1, i);
        for (int value : arr) {
            System.out.print(value + "  ");
        }
        System.out.println();
    }
}
