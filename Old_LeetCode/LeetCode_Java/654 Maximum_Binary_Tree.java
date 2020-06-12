public class TreeNode {
      int val;       //The value of the node
      TreeNode left; //The left child node
      TreeNode right; //The right child node
      TreeNode(int x) { val = x; } //The constructor of the TreeNode with parameter val x.
}

class Solution {
       
//Recursively construct the binary tree 
   public TreeNode constructMaximumBinaryTree(int[] nums) {
        if(nums==null || nums.length==0) return null;
        int max = arrMax(nums);
        TreeNode root = new TreeNode(max);
        int[] left = getLeftArr(nums, getMaxIndex(nums, max));
        int[] right = getRightArr(nums,getMaxIndex(nums, max));
        root.left = constructMaximumBinaryTree(left);
        root.right = constructMaximumBinaryTree(right);
        return root;
    }
    
   
//The maximum in the array
    public int arrMax(int[] nums){
        int max = 0;
        for(int i: nums) max = i>max ? i:max;
        return max;
    }
    
//Get the left side array 
    private int[] getLeftArr(int[] nums, int index){
        int[] left = new int[index];
        for(int i=0; i<index; i++){
            left[i] = nums[i];
        }
        return left;
    }
    
//Get the right side array
    private int[] getRightArr(int[] nums, int index){
         int[] right = new int[nums.length-1-index];
        for(int i=0; i<right.length; i++){
            right[i] = nums[index+i+1];
        }
        return right;
    }
 
//Get the index of the maximum   
    private int getMaxIndex(int[] nums, int max){
        int index = 0;
        for (int i = 0 ; i<nums.length ; i++){
            if (nums[i]==max) index = i;
        }
        return index;
    }
}
