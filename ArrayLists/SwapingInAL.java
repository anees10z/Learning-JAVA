package ArrayLists;

import java.util.ArrayList;

public class SwapingInAL {
    public static void swap(ArrayList<Integer> list, int idx1, int idx2) {
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }

    public static void main(String[] args) {
        ArrayList<Integer> numList = new ArrayList<>();
        numList.add(6);
        numList.add(2);
        numList.add(13);
        numList.add(46);
        numList.add(434);
        System.out.println("BeforeSwap: " + numList);
        swap(numList, 1, 3);
        System.out.println("AfterSwap: " + numList);
    }
}
