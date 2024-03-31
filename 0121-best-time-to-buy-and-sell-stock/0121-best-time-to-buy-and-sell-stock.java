class Solution {
    public int maxProfit(int[] prices) {
        int minimum=prices[0];
        int profit=0;
        for(int i=1;i<prices.length;i++){
            int difference=prices[i]-minimum;
            profit=Math.max(profit,difference);
            minimum=Math.min(minimum,prices[i]);
        }
        return profit;
        
    }
}