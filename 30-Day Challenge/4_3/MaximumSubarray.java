/**
Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

Example:

Input: [-2,1,-3,4,-1,2,1,-5,4],
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.

Follow up:

If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.
**/

//Runtime 1ms ,Memory Usage: 39.5 MB, Beats 84.75%;
//Dynamic Programming
class Solution {
    public int maxSubArray(int[] nums) {
        //All[i-1] = max{nums[i-1], End[i-1], All[i-2]}
        int n = nums.length;
        int[] all = new int[n];
        int[] end = new int[n];
        all[0] = nums[0];
        end[0] = nums[0];
        
        for (int i=1; i<=n-1; i++){
            //End[i]
            if(nums[i]+end[i-1] > nums[i]){
                end[i] = nums[i]+end[i-1];
            }else{
                end[i] = nums[i];
            }
            //compare nums[i], maxEnd and all.get(i-1)
            int preMax = all[i-1];
            int temp = end[i];
            if(temp < preMax){
                temp = preMax;
            }else if (temp < nums[i]){
                temp = nums[i];
            }
            all[i] = temp;
        }
        return all[n-1];
    }
}

//Better solution: 0ms
class Solution {
    public int maxSubArray(int[] nums) {
        int left = 0;
        int right = 1;
        int max = nums[left];
        int sum = nums[left];
        
        if(nums.length == 1)
            return nums[0];
        
        while(right < nums.length && left < nums.length){
            if((sum + nums[right]) < nums[right]) {
                left = right;
                sum = nums[right];
                if(nums[right] > max){
                    max = nums[right];
                }
            }else{
                sum += nums[right];
                if(sum > max){
                    max = sum;
                }
            }
            right ++;
        }
        
            return max;

    }
    
}