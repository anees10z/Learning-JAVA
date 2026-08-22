// package Hashing.HashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetBasics {
    public static void main(String[] args) {

        LinkedHashSet<String> lhs = new LinkedHashSet<>();

        lhs.add("Delhi");
        lhs.add("Mumbai");
        lhs.add("Kolkata");
        lhs.add("Chennai");
        lhs.add("Delhi");

        System.out.println("LinkedHashSet (Maintains Insertion Order): " + lhs);

        System.out.println("Size: " + lhs.size());

        System.out.println("Contains Mumbai: " + lhs.contains("Mumbai"));
        System.out.println("Contains Pune: " + lhs.contains("Pune"));

        lhs.remove("Kolkata");
        System.out.println("After remove Kolkata: " + lhs);

        System.out.println("isEmpty: " + lhs.isEmpty());

        Iterator<String> it = lhs.iterator();
        while (it.hasNext()) {
            System.out.println("City: " + it.next());
        }

        LinkedHashSet<Integer> setA = new LinkedHashSet<>();
        setA.add(10);
        setA.add(20);
        setA.add(30);
        setA.add(40);

        LinkedHashSet<Integer> setB = new LinkedHashSet<>();
        setB.add(30);
        setB.add(40);
        setB.add(50);
        setB.add(60);

        LinkedHashSet<Integer> union = new LinkedHashSet<>(setA);
        union.addAll(setB);
        System.out.println("Union: " + union);

        LinkedHashSet<Integer> intersection = new LinkedHashSet<>(setA);
        intersection.retainAll(setB);
        System.out.println("Intersection: " + intersection);

        LinkedHashSet<Integer> difference = new LinkedHashSet<>(setA);
        difference.removeAll(setB);
        System.out.println("Difference: " + difference);

        lhs.clear();
        System.out.println("After clear: " + lhs);
        System.out.println("isEmpty after clear: " + lhs.isEmpty());
    }
}