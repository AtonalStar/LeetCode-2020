package ReverseBits;
import java.util.*;
import java.math.BigInteger;

public class Main {

	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Input: ");
		String s = sc.nextLine();
		int x =0;
		 try {
             x = Integer.parseInt(s);
         } catch (NumberFormatException e) {
             System.out.println("Not a valid integer");
         }
		 String rb=reverseBits(x);
		 BigInteger rbn = new BigInteger(rb,2);
		 System.out.println("ReverseBits number: "+ rbn.toString());

	}
	
	public static String reverseBits(int x){
		String r="";
		int t=0;
		while(x!=0){
			int b=x%2;
			r=r+String.valueOf(b);
			t++;
			x=x/2;
		}
		if(t<32){
			while(t<32){
				r=r+"0";
				t++;
			}
		}
		return r;
	}
	

}
