class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length==0) return 0;
        
        int len = prices.length;
        int max = prices[len-1];
        int min = prices[0];
        
        int[] profit_1 = new int[len];
        int[] profit_2 = new int[len];
        
        for(int i=1; i<len-1;i++){
            min = Math.min(min,prices[i]);
            profit_1[i]=Math.max(profit_1[i-1], prices[i]-min);
        }
        
        for(int i=len-2; i>=0; i--){
            max = Math.max(max,prices[i]);
            profit_2[i] = Math.max(profit_2[i+1], max-prices[i]);
        }
        
        int result = 0;
        for(int i=0; i<len;i++){
            result = Math.max(result, profit_1[i]+profit_2[i]);
        }
        return result;
    }
}
