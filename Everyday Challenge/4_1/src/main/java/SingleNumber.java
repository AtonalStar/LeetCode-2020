/**
 * Given a non-empty array of integers, every element appears twice except for one. Find that single one.
 *
 * Note:
 * Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?
 *
 * Example 1:
 * Input: [2,2,1]
 * Output: 1
 *
 * Example 2:
 * Input: [4,1,2,1,2]
 * Output: 4
 */

import java.util.HashMap;

class SingleNumber {
    /**
     * Solution 1, HashMap, Time = O(n), Space = O(n)
     * @param nums
     * @return
     */
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int result = 0;
        for (Integer num : nums) {
//            if (!map.containsKey(num)) {
//                map.put(num, 1);
//            } else {
//                map.replace(num, map.get(num) + 1);
//            }
            //map.getOrDefault(key, defaultValue), if key exist, use .get(key) value, otherwise, use defaultValue.
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        for (Integer k : map.keySet()) {
            if (map.get(k) == 1) {
                result = k;
            }
        }
        return result;
    }

    /**
     * Solution 2, Bitwise, Time = O(n), Space = O(1)
     * If we take XOR of zero and some bit, it will return that bit
     * a ⊕ 0 = a

     * If we take XOR of two same bits, it will return 0
     * a ⊕ a = 0
     * a ⊕ b ⊕ a = (a ⊕ a) ⊕ b = 0 ⊕ b = b
     * @param nums
     * @return
     */
    public int betterSolution(int[] nums){
        int a = 0;
        for (int i : nums) {
            a ^= i;
        }
        return a;
    }
}
