import java.util.*;

class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] count = new int[26];
        for(char c:tasks){
            count[c-'A']++;
        }
        Arrays.sort(count); //Sort the array count from small to large
        
        int dif=25;
        while(dif>=0 && count[dif]==count[25]) dif--;
        
        /*
            If n<=the kinds of tasks, like [A,A,A,B,B,B,C,C,D] n=2: result is (A,B,C,D,A,B,C,A,B) 9 = tasks.length, cause the interval can be larger than n.
            If n>the kinds of tasks, like [A,A,A,B,B,B] n=2: result is (A,B,_,A,B,_,A,B) 8 = (largest number of task -1)*(n+1)+ number of the most task.
        */
        return (int)Math.max(tasks.length, (count[25]-1)*(n+1)+25-dif);
    }
}
