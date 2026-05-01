package LinkedList.JCF_LL;

import java.util.LinkedList;

public class Use_LL {
    public static void main(String[] args) {
        // create a LL using JCF
        LinkedList<Integer> ll = new LinkedList<>();
        // add elements
        ll.add(22);
        ll.addLast(12);
        ll.addLast(2);
        ll.addLast(82);
        ll.addFirst(2);
        ll.addFirst(23);
        ll.add(1000);
        System.out.println(ll);
        // remove
        ll.remove();
        ll.removeFirst();
        ll.removeLast();

        System.out.println(ll.contains(2));

        // print
        System.out.println(ll);
        System.out.println("size: "+ ll.size());
    }
}
