// package Hashing.HashSet;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetBasics {
    public static void main(String[] args) {

        TreeSet<Integer> ts = new TreeSet<>();

        ts.add(40);
        ts.add(10);
        ts.add(30);
        ts.add(20);
        ts.add(50);
        ts.add(10);

        System.out.println("TreeSet (Automatically Sorted): " + ts);

        System.out.println("Size: " + ts.size());

        System.out.println("Contains 30: " + ts.contains(30));
        System.out.println("Contains 99: " + ts.contains(99));

        ts.remove(20);
        System.out.println("After remove 20: " + ts);

        System.out.println("isEmpty: " + ts.isEmpty());

        System.out.println("First (Smallest): " + ts.first());
        System.out.println("Last (Largest): " + ts.last());
        System.out.println("Higher than 30 (>30): " + ts.higher(30));
        System.out.println("Lower than 30 (<30): " + ts.lower(30));
        System.out.println("Ceiling of 25 (>=25): " + ts.ceiling(25));
        System.out.println("Floor of 25 (<=25): " + ts.floor(25));

        Iterator<Integer> it = ts.iterator();
        while (it.hasNext()) {
            System.out.println("Element: " + it.next());
        }

        TreeSet<Integer> setA = new TreeSet<>();
        setA.add(1);
        setA.add(2);
        setA.add(3);
        setA.add(4);

        TreeSet<Integer> setB = new TreeSet<>();
        setB.add(3);
        setB.add(4);
        setB.add(5);
        setB.add(6);

        TreeSet<Integer> union = new TreeSet<>(setA);
        union.addAll(setB);
        System.out.println("Union: " + union);

        TreeSet<Integer> intersection = new TreeSet<>(setA);
        intersection.retainAll(setB);
        System.out.println("Intersection: " + intersection);

        TreeSet<Integer> difference = new TreeSet<>(setA);
        difference.removeAll(setB);
        System.out.println("Difference: " + difference);

        ts.clear();
        System.out.println("After clear: " + ts);
        System.out.println("isEmpty after clear: " + ts.isEmpty());
    }
}