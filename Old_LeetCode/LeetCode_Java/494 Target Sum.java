package TargetSum;

public class Main {
	
	public static void main(String[] args) {
		int[] test= {1,1,1,1,1};
		int target = 3;
		System.out.println("The number of target ways is: "+ findTargetSumWays(test,target));
	}
	/*
	 * Use Subset Sum method, find the number of subset P(n) - the subset of the elements in the original test array with '+' assigned. 
	 * For example: {1,2,3,4,5} with target 3, we have 1-2+3-4+5=3,then P(n)={1,3,5}.
	 * P(n)= (Sum(a)+target)/2
	 */
	public static int findTargetSumWays(int[] a, int t){
		//calculate Sum(a)
		int sum = 0;
		for (int x:a){
			sum +=x;
		}
		if((sum+t)%2==1||sum<t){
			return 0;
		}else{
			return subsetSum(a,(sum+t)>>1);//>> is faster than /2
		}
	}
	
	/*
	 * Construct the possible result array pr[n]
	 * pr[i]stands for the number of sub-targetSum ways with the subset as the set and 
	 * (sum+target)/2 - current element as the current target.
	 */
	public static int subsetSum(int[] a, int t){
		int[] pr = new int[t+1];
		pr[0]=1;
		for (int x:a){
			for(int i=t;i>=x;i--){
				pr[i]+=pr[i-x];
			}
		}
		return pr[t];
	}
}
