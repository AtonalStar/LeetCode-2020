class Solution {
    public int searchInsert(int[] nums, int target) {
        for(int i=0; i<nums.length; i++){
            if(nums[i]==target)
                return i;
            if(nums[i]<target){
                if(i+1>nums.length-1)
                    return i+1;
                else if (nums[i+1]>target)
                    return i+1;
            }
            if(nums[i]>target){
                if(i-1<0)
                    return 0;
                else if (nums[i-1]<target)
                    return i;
            }
        }
        return 0;
    }
}
