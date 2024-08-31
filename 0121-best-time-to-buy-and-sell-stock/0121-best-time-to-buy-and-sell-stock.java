class Solution {
    public int maxProfit(int[] prices) {
        int max_profit=0;
        int min_till_now=prices[0];
        for(int i=1;i<prices.length;i++){
            min_till_now=Math.min(min_till_now,prices[i]);
            
            int profit=prices[i]-min_till_now;
            max_profit=Math.max(profit,max_profit);
            
        }
        return max_profit;
    }
}