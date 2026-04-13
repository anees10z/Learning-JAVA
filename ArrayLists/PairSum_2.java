package ArrayLists;

import java.util.ArrayList;

public class PairSum_2 {
    public static boolean optimized_2_Pointer(ArrayList<Integer> list, int target) {
        int pivotIndex = -1;
        int n = list.size();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) > list.get(i + 1)) {
                pivotIndex = i;
                break;
            }
        }
        int lp = pivotIndex + 1;
        int rp = pivotIndex;
        while (lp != rp) {
            if (list.get(lp) + list.get(rp) == target)
                return true;
            else if (list.get(lp) + list.get(rp) > target) {
                // if (rp == 0)
                // rp = list.size() - 1;
                // else
                // rp--;
                rp = (n + rp - 1) % n;
            } else {
                // if (lp == list.size() - 1)
                // lp = 0;
                // else
                // lp++;
                lp = (lp + 1) % n;
            }
        }
        return false;
    }

    // Ques:- Find if any pair in a sorted and rotated arrayList has a terget sum?
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        System.out.println(optimized_2_Pointer(list, 36));
    }
}
