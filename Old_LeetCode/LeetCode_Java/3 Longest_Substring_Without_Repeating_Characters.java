class Solution {
    public int lengthOfLongestSubstring(String s) {
        int len=s.length();
        char[] arr = s.toCharArray();        
        
        int count=0;  //length of the current subString
        int start=0;  //Start of the new subString
        boolean check=true;
        
        int longLenth=0; //The length of the longest subString

        for(int i=0;i<len;i++){
            check=true;
            for(int j=0;j<count;j++){
                if(arr[j+start]==arr[i]){  //Check if the next char is the same, if so, restart the subString.   
                    check=false;
                    start=j+start+1;      
                    break;
                }
            }
            if(check){
                count++;
                if(i==len-1&&longLenth<count){ //The outer loop end, and reset the result as the biggest count
                    longLenth=count;
                }
            }
            else{
                if(longLenth<count){ //Reset the result as the biggest count
                    longLenth=count;
                }
                count=i-start+1;   //Restart the subString, set the start index as the index of the next char

            }
        }

        return longLenth;

    }
}
