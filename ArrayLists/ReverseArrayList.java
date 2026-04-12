package ArrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ReverseArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numList = new ArrayList<>();
        ArrayList<Integer> numList2 = new ArrayList<>(Arrays.asList(62, 23, 13, 46, 12, 234));

        numList.add(6);
        numList.add(2);
        numList.add(13);
        numList.add(46);
        numList.add(434);
        numList.add(12);
        System.out.println("List1");
        for (int i = numList.size() - 1; i >= 0; i--) {
            System.out.print(numList.get(i) + " ");
        }
        System.out.println();

        System.out.println("List2");
        Collections.reverse(numList2);
        System.out.println(numList2);

        // max from list
        int max = Collections.max(numList2);
        int min = Collections.min(numList2);
        // can also done using loop and comparing
        System.out.println("Max = " + max);
        System.out.println("Min = " + min);
    }
}
