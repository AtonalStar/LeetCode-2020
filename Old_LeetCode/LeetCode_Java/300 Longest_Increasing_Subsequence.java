class Solution {
    public int lengthOfLIS(int[] nums) {
        if(nums.length == 0||nums == null) 
            return 0;
       
       //Dynamic program, dp[i] stores the size of the longest subsequence contains nums[i] 
        int[] dp = new int[nums.length];
        for(int i=0;i<dp.length;i++){
            dp[i]=1;
        }
       
        //If the previous item is smaller than the current one, dp[i] increase.
        for(int i=1; i<nums.length; i++){
            for(int j=0; j<i; j++){
                if(nums[i]>nums[j]){
                    dp[i]=Math.max(dp[j]+1,dp[i]); //The current dp[i] may be bigger than the length of [...,num[j],num[i],...].
                }
            }
        }
        
        //Get the maximum of the array dp
        int max=1;
        for(int x: dp){
            max=Math.max(max,x);
        }
        
        return max;
    }
}
