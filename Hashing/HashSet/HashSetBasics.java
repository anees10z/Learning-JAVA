// package Hashing.HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetBasics {
    public static void main(String[] args) {

        HashSet<Integer> hs = new HashSet<>();

        hs.add(10);
        hs.add(20);
        hs.add(30);
        hs.add(40);
        hs.add(10);

        System.out.println("Set: " + hs);

        System.out.println("Size: " + hs.size());

        System.out.println("Contains 20: " + hs.contains(20));
        System.out.println("Contains 50: " + hs.contains(50));

        hs.remove(20);
        System.out.println("After remove 20: " + hs);

        System.out.println("isEmpty: " + hs.isEmpty());

        Iterator<Integer> it = hs.iterator();
        while (it.hasNext()) {
            System.out.println("Element: " + it.next());
        }

        HashSet<Integer> setA = new HashSet<>();
        setA.add(1);
        setA.add(2);
        setA.add(3);
        setA.add(4);

        HashSet<Integer> setB = new HashSet<>();
        setB.add(3);
        setB.add(4);
        setB.add(5);
        setB.add(6);

        HashSet<Integer> union = new HashSet<>(setA);
        union.addAll(setB);
        System.out.println("Union: " + union);

        HashSet<Integer> intersection = new HashSet<>(setA);
        intersection.retainAll(setB);
        System.out.println("Intersection: " + intersection);

        HashSet<Integer> difference = new HashSet<>(setA);
        difference.removeAll(setB);
        System.out.println("Difference: " + difference);

        hs.clear();
        System.out.println("After clear: " + hs);
        System.out.println("isEmpty after clear: " + hs.isEmpty());
    }
}