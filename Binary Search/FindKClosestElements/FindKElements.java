/*
 * Given a sorted array, two integers k and x, find the k closest elements to x in the array. 
 * The result should also be sorted in ascending order. 
 * If there is a tie, the smaller elements are always preferred.
 * 
 * The value k is positive and will always be smaller than the length of the sorted array.
 * Length of the given array is positive and will not exceed 10^4
 * Absolute value of elements in the array and x will not exceed 10^4
 */
import java.util.*;

/*
 * This method takes 13ms, only beats 22.94% submissions
 */
public class FindKClosestElements {
	public List<Integer> findClosestElements(int[] arr, int k, int x) {
        List<Integer> list = new ArrayList<Integer>();
        //x < the first element, then the list contains the first k elements of arr. 
        if(x<=arr[0]) {
            for (int i=0; i<k; i++){
                list.add(arr[i]);
            } 
            Collections.sort(list);
            return list;
        }
        //x > the last element, then the list contains the last k elements of arr. 
         if(x>=arr[arr.length-1]) {
            for (int i=0; i<k; i++){
                list.add(arr[arr.length-1-i]);
            } 
            Collections.sort(list);
            return list;
        }
        
        //Find the nearest value first
        int mid, l=0, r=arr.length-1;
        int minAbs = 10000;
        int index = 0;
        while(l+1<r){
            mid=l+(r-l)/2;
            int abs = Math.abs(arr[mid]-x);
            if(abs<minAbs){
                minAbs = abs;
                index = mid;
            }else if(arr[mid]-x > 0){
                r = mid;
            }else{
                l = mid;
            }
        }
        if(minAbs>Math.abs(arr[l]-x)){
            minAbs=Math.abs(arr[l]-x);
            index = l;
        }else if(minAbs>Math.abs(arr[r]-x)){
            minAbs=Math.abs(arr[r]-x);
            index = r;
        }
        
        //Find the closest k elements
        list.add(arr[index]);
        int left = index-1, right = index +1;
        for(int i=0; i<k-1; i++){
            if(left<0 && right<=arr.length-1){
                list.add(arr[right]);
                right++;
            }else if(left>=0 && right>arr.length-1){
                list.add(arr[left]);
                left--;
            }else{
                if(Math.abs(arr[left]-x)<=Math.abs(arr[right]-x)){
                    list.add(arr[left]);
                    left--;
                }else{
                    list.add(arr[right]);
                    right++;
                }   
            }            
        }
        Collections.sort(list);
        return list;
    }
}
