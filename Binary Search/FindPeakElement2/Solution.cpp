/*
A peak element is an element that is greater than its neighbors.

Given an input array nums, where nums[i] ≠ nums[i+1], find a peak element and return its index.

The array may contain multiple peaks, in that case return the index to any one of the peaks is fine.

You may imagine that nums[-1] = nums[n] = -∞.
*/

//This solution takes 4ms, beats 96.47% cpp submissions

class Solution {
public:
    int findPeakElement(vector<int>& nums) {
        int mid, start = 0, end = nums.size() -1;
        while(start+1 < end){
            mid = start + (end-start)/2;
            if(nums[mid]<nums[mid+1]){                
                start = mid;    
            }else{
                end = mid;
            }
        }
        if(nums[start]<nums[end])
			return end;
        else
            return start;
    }
};