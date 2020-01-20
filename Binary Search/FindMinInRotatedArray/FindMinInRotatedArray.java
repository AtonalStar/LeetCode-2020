/*
Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.

(i.e.,  [0,1,2,4,5,6,7] might become  [4,5,6,7,0,1,2]).

Find the minimum element.

You may assume no duplicate exists in the array.
*/

class FindMinInRotatedArray {
    public int findMin(int[] nums) {
        int len =nums.length;
        //One element
        if(len==1) return nums[0];
        
        //No rotation
        if(nums[len-1]>nums[0]) return nums[0];
        
        //Binary search
        int mid, l = 0, r = len-1;
        while(l<r){
            mid = l+(r-l)/2;
            if(nums[mid]>nums[mid+1]){
                return nums[mid+1];
            }else if(nums[mid-1]>nums[mid]){
                return nums[mid];
            }else{
                //Change search space            
                if(nums[mid]>nums[0])
                    l = mid;
                else 
                    r = mid;
            }
            
        }
            return nums[l];
    }
}