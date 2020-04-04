/**
Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Example:

Input: [0,1,0,3,12]
Output: [1,3,12,0,0]

Note:
You must do this in-place without making a copy of the array.
Minimize the total number of operations.

Hint:
A two-pointer approach could be helpful here. The idea would be to have one pointer for iterating the array and another pointer that just works on the non-zero elements of the array.
**/

//Time: O(n), Space: O(1) 
class Solution {
    public void moveZeroes(int[] nums) {
        //Keep a nonZero pointer to store the current non-zero element position
        //traverse the array nums for only one time, nonZeroP becomes the index of the last non-zero element + 1
        int nonZeroP = 0;
        for (int i = 0;  i < nums.length; i++){
            if (nums[i] != 0){
                 nums[nonZeroP] = nums[i];   
                nonZeroP++;
            }
        }    
        while(nonZeroP < nums.length){
            nums[nonZeroP] = 0;
            nonZeroP++;
        }
        
    }
}