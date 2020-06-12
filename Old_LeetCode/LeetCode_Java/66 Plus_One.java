class Solution {
    public int[] plusOne(int[] digits) {
        int i=digits.length-1;
        if(i==0){
            if(digits[i]!=9){
                digits[i]++;
                return digits;
            }else{
                int[] plusDig = new int[2];
                plusDig[0]=1;
                plusDig[1]=0;
                return plusDig;
            }
        }else{
            while(i>0){
              if(digits[i]!= 9){
                digits[i]++;
                break;
              }else{
                digits[i]=0;
                i--;
              }
            }
        
            if(digits[1]==0 && i==0){
                if(digits[0]!=9){
                    digits[0]++;
                    return digits;
                }else{
                    int[] plusDig = new int[digits.length+1];
                    plusDig[0]=1;
                    plusDig[1]=0;
                    for(int j=2; j<plusDig.length; j++){
                        plusDig[j]=digits[j-1];
                    }
                    return plusDig;
                }
            
            }else{
                return digits;
            }
        }
    }
    
}
