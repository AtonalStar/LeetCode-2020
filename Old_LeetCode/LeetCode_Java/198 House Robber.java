class Solution {
    public int rob(int[] nums) {
        int result = 0;
        int[] dp = new int[nums.length];
        dp[0]=nums[0];
		dp[1]=Math.max(nums[0], nums[1]);
		for(int i=2; i<=nums.length-1;i++){
			dp[i]=Math.max(nums[i]+dp[i-2], dp[i-1]);
		}
		result = dp[nums.length-1];
		return result;
    }
}
