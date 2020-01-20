/*
Given an array of integers nums sorted in ascending order, find the starting and ending position of a given target value.

Your algorithm's runtime complexity must be in the order of O(log n).

If the target is not found in the array, return [-1, -1].
*/

class SearchRange {
    public int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1};
        
        //array is empty, return {-1,-1}
        if(nums.length==0){
            return result;
        }
        
        //Binary search: search for the first target (the lowest range) and the last target (the largest range) respectively
        //The first target
        int l=0, r=nums.length -1;
        while(l+1<r){
            int mid = l+(r-l)/2;
            if(nums[mid]==target){
                r = mid;
            }else if(nums[mid]>target){
                r = mid;
            }else{
                l = mid;
            }           
        }//l+1 = r
        if(nums[l]==target){
            result[0]=l;
        }else if(nums[r]==target){ 
        //Must be else if, because we need the left most position, 
        //otherwise, the r index will overwrite the result
            result[0]=r;
        } 
               
        //The last target
        l=0;
        r=nums.length-1;
        while(l+1<r){
            int mid = l+(r-l)/2;
            if(nums[mid]==target){
               l = mid;
            }else if(nums[mid]>target){
                r = mid;
            }else{
                l = mid;
            }           
        }//l+1 = r
        if(nums[r]==target) result[1]=r;
        else if(nums[l]==target) result[1]=l;
        
        return result;
    }
}