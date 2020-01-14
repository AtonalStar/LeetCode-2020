/*
Implement int sqrt(int x).
Compute and return the square root of x, where x is guaranteed to be a non-negative integer.
Since the return type is an integer, the decimal digits are truncated and only the integer part of the result is returned.
*/

public class Sqrt {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int x = 8;
//		System.out.println(mySqrt(x));
//	}
	
	public int mySqrt(int x) {
	   if(x==1||x==0) return x;
	   int mid, left = 1, right = x;
	   while(left < right){  
	        mid = left+(right-left+1)/2;
	        if(mid<=x/mid) left = mid;
	        else right = mid-1;                
	   }  
	   return left;
	}

}