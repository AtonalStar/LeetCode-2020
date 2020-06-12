class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        for (int i=0; i<=prices.length-1; i++){
            for(int j=i+1; j<=prices.length-1;j++){
                if(prices[i]<prices[j]){
                    int temp = prices[j]-prices[i];
                    max = Math.max(temp,max);
                }
            }
        }
        return max;
    }
}
