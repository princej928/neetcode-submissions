class Solution {
    public int maxProfit(int[] prices) {
        int max =0;
        int diff = prices[0];
        int min = prices[0];
        for(int i =1;i<prices.length;i++){
            diff = prices[i]-min;

            if(prices[i]<min){
                min = prices[i];
            }
            
            
            max = Math.max(diff,max);
        }
        return max;
    }
}
