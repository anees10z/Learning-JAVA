package ArrayLists;

import java.util.ArrayList;
import java.util.Collections;

public class AscendingDescendingInAL {
    public static void main(String[] args) {
        ArrayList<Integer> numList = new ArrayList<>();
        numList.add(6);
        numList.add(2);
        numList.add(13);
        numList.add(46);
        numList.add(434);
        //Sorting-> Ascending | Descending
        
        System.out.println("Ascending Order");
        Collections.sort(numList);
        System.out.println(numList);

        System.out.println("Descending Order");
        Collections.sort(numList, Collections.reverseOrder());
        System.out.println(numList);
    }
}
