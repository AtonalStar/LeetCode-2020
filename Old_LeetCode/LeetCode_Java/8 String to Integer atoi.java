class Solution {
    public int myAtoi(String str) {
        if(str.isEmpty()) return 0;
        str=str.trim();
        int sign = 1, start = 0;
        long result = 0;
        char first=str.charAt(0);
        
        if (first=='-'||first=='+'){
            sign = first=='-'? -1 : 1;
            start++;
        }
            
        for(int i=start; i<str.length();i++){
            if (!Character.isDigit(str.charAt(i))){
			    return (int) result * sign;
            }
            result = result * 10 + str.charAt(i) - '0';
		    if (sign==1 && result > Integer.MAX_VALUE){
			    return Integer.MAX_VALUE;   
            }else if(sign==-1 && (-1)*result< Integer.MIN_VALUE){
                return Integer.MIN_VALUE;
            }
        }
         return  (int) result*sign;
    }  
   
}
