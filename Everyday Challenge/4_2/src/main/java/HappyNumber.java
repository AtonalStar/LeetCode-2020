/**
 * Write an algorithm to determine if a number is "happy".
 *
 * A happy number is a number defined by the following process: Starting with any positive integer, replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers.
 *
 * Example:
 *
 * Input: 19
 * Output: true
 * Explanation:
 * 1^2 + 9^2 = 82
 * 8^2 + 2^2 = 68
 * 6^2 + 8^2 = 100
 * 1^2 + 0^2 + 0^2 = 1
 */

import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

public class HappyNumber {
    ArrayList<Integer> sums;

    public HappyNumber(){
        this.sums = new ArrayList<Integer>();
    }

    public boolean isHappy(int n) {
        if(n == 1){
            return true;
        }
        ArrayList<Integer> list = new ArrayList<Integer>();
        while(n/10>0){
            list.add(n%10);
            n /= 10;
        }
        list.add(n);
        int len = list.size();
        int sum = 0;
        for (int i=0; i<len; i++){
            sum += list.get(i) * list.get(i);
        }
        if(sum == 1){
            return true;
        }else if(!this.sums.contains(sum)){
            this.sums.add(sum);
            return isHappy(sum);
        }else{
            return false;
        }
    }

    /**
     * Better solution
     */
    public boolean isBetterHappy(int n) {
        n = (int) Math.abs(n);
        Set<Integer> exist = new HashSet<Integer>();
        while (n != 1) {
            if (!exist.add(n)) {
                return false;
            }
            int tmp = 0;
            while (n > 0) {
                tmp += Math.pow((n % 10), 2);
                n /= 10;
            }
            n = tmp;
        }
        return true;
    }
}
