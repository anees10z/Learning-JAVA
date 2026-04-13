package ArrayLists;

import java.util.ArrayList;

// on sorted list
public class PairSum_1 {
    public static boolean bruteForce(ArrayList<Integer> list, int target) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) + list.get(j) == target)
                    return true;
            }
        }
        return false;
    }
    public static boolean optimized_2_Pointer(ArrayList<Integer> list, int target) {
        int lp = 0;
        int rp = list.size() - 1;
        while (lp < rp) {
            if (list.get(lp) + list.get(rp) == target)
                return true;
            else if (list.get(lp) + list.get(rp) > target)
                rp--;
            else
                lp++;
        }
        return false;
    }
    
    // Ques:- Find if any pair in a sorted arrayList has a terget sum?
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(8);
        // System.out.println(bruteForce(list, -90));
        System.out.println(optimized_2_Pointer(list, 14));
    }
}
