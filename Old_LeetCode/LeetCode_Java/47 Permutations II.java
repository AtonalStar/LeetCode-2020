import java.util.*;

class Solution {

    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> wholeList = new ArrayList<List<Integer>>(); //The result list
        List<Integer> list=new ArrayList<Integer>(); //The temperary list
        boolean[] isUsed = new boolean[nums.length]; //The boolean array records if the according nums item has been used. This is used to avoid the repeating use of the same value. Only the former item is used can we use the latter one.
        
        if(nums.length==0||nums==null) return wholeList;
        Arrays.sort(nums); //In order to check the repeating values
        searchList(wholeList,list,isUsed,nums);
        return wholeList;
    }
    
    public void searchList(List<List<Integer>> whole, List<Integer> list, boolean[] isUsed, int[] nums){
        //When the length of the list is the same as the length of the integer array nums, the list can be added into the resulting whole list.(Base case)
        if(list.size()==nums.length){
            whole.add(new ArrayList<Integer>(list));
            return;
        }
        
        for(int i=0; i<nums.length; i++){
            if(isUsed[i]) continue;
            if(i>0 &&!isUsed[i-1] && nums[i]==nums[i-1])  continue; //i>0 must be placed first!
            list.add(nums[i]);
            isUsed[i]=true;
            searchList(whole, list, isUsed, nums);
            isUsed[i]= false;
            list.remove(list.size()-1);
        }
    }
}
