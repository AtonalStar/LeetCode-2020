class Solution {
    
    public void nextPermutation(int[] nums) {
        int len=nums.length;
        if(len<=1) return;
        
        //loop k from length-1 to 0 and find the first number that does not satisfy the ascending order;
        int k=len-2;
        while(k>=0 && nums[k]>=nums[k+1]){
            k--;
        }
        
        //search from the last element, find the first number that is larger than nums[k], swap them.  
        if(k>=0){
            int m=len-1;
            while(nums[m]<=nums[k]){
                m--;
            }
            swap(nums,m,k);
        }
        
        //sort nums[k+1]..nums[len-1], Arrays.sort(arr, fromIndex, toIndex+1) sort arr[fromindex]..arr[toIndex].
        Arrays.sort(nums, k+1, len);
        
        //If the whole nums is in the descending order, k will be -1; 
        //The whole nums should be changed into ascending order.
        if(k==-1){
            for(int i=0; i<len; i++){
                swap(nums,i,len-1-i);
            }
        }
        
        
    }
    
    public void swap(int[] n, int i, int j){
        int temp = n[i];
        n[i]=n[j];
        n[j]=temp;
    }
}
