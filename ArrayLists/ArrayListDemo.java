package ArrayLists;

import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> numList = new ArrayList<>();
        // Add operation -> O(1)
        numList.add(10);
        numList.add(13);
        numList.add(87);
        System.out.println("Added " + numList);

        // Get opertaion -> O(1)
        System.out.println("Get " + numList.get(2));
        // remove/delete element -> O(n)
        System.out.println("Removed " + numList.remove(1));
        // setElementAtIndex -> O(n)
        numList.set(1, 16);
        System.out.println("set " + numList);
        // contains -> O(n)
        System.out.println(numList.contains(23));

        // other add operation -> O(n)
        numList.add(1, 43);
        System.out.println(numList);
        numList.add(1, 21);
        numList.add(1, 4);
        System.out.println(numList);
    }
}
