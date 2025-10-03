package ArraysAndSorting;

public class BuySellStock {
    public static int buySell(int[] prices) {
        int maxprofit = 0;
        int profit = 0;
        int buyPrice = Integer.MAX_VALUE;
        // O(n)
        for(int i=0; i<prices.length; ++i){
            if(buyPrice<prices[i]){
                profit=prices[i] - buyPrice;
                maxprofit = Math.max(maxprofit, profit);
            }else{
                buyPrice = prices[i];
            }
        }

        return maxprofit;
    }
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4}; 
        // int[] prices = {7,6,5}; 
        System.out.println(buySell(prices));
    }
}
