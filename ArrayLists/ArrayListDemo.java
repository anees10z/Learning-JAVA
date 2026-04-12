package ArrayLists;

import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> numList = new ArrayList<>();
        // Add operation -> O(1)
        numList.add(10);
        numList.add(13);
        numList.add(87);

        System.out.println(numList);
    }
}
