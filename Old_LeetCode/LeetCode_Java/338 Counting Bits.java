package CountingBits;

import java.util.*;

public class Main {
	public static Scanner kb = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Input: ");
		String s = kb.nextLine();
		int x=0;
		 try {
             x = Integer.parseInt(s);
         } catch (NumberFormatException e) {
             System.out.println("Not a valid integer");
         }
		System.out.println("Number of 1 in each number: "+integerArrayToString(countBits(x),x+1));
		
	}
	
	public static String integerArrayToString(int[] nums, int length) {
        if (length == 0) {
            return "[]";
        }
    
        String result = "";
        for(int index = 0; index < length; index++) {
            int number = nums[index];
            result += Integer.toString(number) + ", ";
        }
        return "[" + result.substring(0, result.length() - 2) + "]";
    }
	
	public static int[] countBits(int num) {
        int[] cb = new int[num+1];
        for(int i=0; i<=num; i++){
            int b=Integer.valueOf(Integer.toBinaryString(i),2);
            int count = 0;
            while(b!=0){
                count++;
                b = (b-1)&b;
            }
           cb[i] = count; 
        }
        return cb;
    }
}
