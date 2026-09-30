package GreedyAlgorithms;

import java.util.*;

public class IndianCoins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> ans = new ArrayList<>();
        int[] currency = { 1, 2, 5, 10, 20, 50, 100, 500, 2000 };
        System.out.println("Enter amount: ");
        int amount = sc.nextInt();
        sc.close();
        int count = 0;

        Arrays.sort(currency);

        for (int i = currency.length - 1; i >= 0; i--) {
            if (currency[i] <= amount) {
                while (currency[i] <= amount) {
                    count++;
                    amount -= currency[i];
                    ans.add(currency[i]);
                }
            }
            if (amount == 0)
                break;
        }

        System.out.println("Min Count = " + count);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
        System.out.println();
    }
}
