package ArrayLists;

import java.util.ArrayList;

public class ContainerWithMostWater {

    public static int mostWaterContainer(ArrayList<Integer> list) {
        int mostWater = Integer.MIN_VALUE;
        int leftLine = -1;
        int rightLine = -1;

        for (int i = 0; i < list.size(); ++i) {
            for (int j = i + 1; j < list.size(); j++) {
                int l = Math.min(list.get(i), list.get(j));
                int b = Math.abs(i - j);
                int currWaterCapacity = l * b;
                if (mostWater < currWaterCapacity) {
                    mostWater = currWaterCapacity;
                    leftLine = i;
                    rightLine = j;
                }
            }
        }
        System.out.println("Left-Line = " + leftLine + " Right-Line = " + rightLine);
        return mostWater;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);
        int res = mostWaterContainer(list);
        System.out.println("Result = " + res);
    }
}
