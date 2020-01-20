/*
A peak element is an element that is greater than its neighbors.

Given an input array nums, where nums[i] ≠ nums[i+1], find a peak element and return its index.

The array may contain multiple peaks, in that case return the index to any one of the peaks is fine.

You may imagine that nums[-1] = nums[n] = -∞.
*/

class FindPeakElement {
    public int findPeakElement(int[] nums) {
        int mid, start = 0, end = nums.length -1;
        while(start < end){
            mid = start + (end-start)/2;
            if(nums[mid]<nums[mid+1]){                
                start = mid + 1;    
            }else{
                end = mid;
            }
        }
         return start;
    }
}