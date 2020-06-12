class Solution {
    public List<String> generateParenthesis(int n) {
		 List<String> list = new ArrayList<String>();
		 backtrack(list, "", 0, 0, n);
		 return list;
	 }
	 
    /**
	  * The backtrack method construct all the Strings of the solution list, by add "(" when its less than the total number n, or add ")" when its less than "(", then add the String to the list when "("and")" both equal to n.
	  * This method can backtrack to the statement where it is called when return.
	  * @param list - The current result String list
	  * @param s - The current string
	  * @param countL - the number of open parentheses in s
	  * @param countR - the number of close parentheses in s
	  * @param n - The number of pairs of parentheses to be constructed
	  */
	 public void backtrack(List<String> list, String s, int countL, int countR, int n){
		 if(s.length()==n*2){
			 list.add(s);
			 return;
		 }			 
		 
		 if(countL<n){
			 backtrack(list, s+"(", countL+1, countR, n);
		 }
		 
		 if(countR<countL){
			 backtrack(list, s+")", countL, countR+1,n);
		 }
	 }

    
}
