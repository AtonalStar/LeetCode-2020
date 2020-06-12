/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0) return null;
        return mergeSort(lists,0,lists.length-1);
    }
    
    //Divide the Linked Lists into half, then merge sort them together. The time complexity is O(nlog(n))   
    public ListNode mergeSort(ListNode[] list, int start, int end){
        if(start==end) return list[start];
        
        int mid = start + (end-start)/2;
        
        ListNode left = mergeSort(list, start, mid);
        ListNode right = mergeSort(list, mid+1, end);
        
        return merge(left,right);
    }
    
    //Merge and sort two lists together.
    public ListNode merge(ListNode n1, ListNode n2){
        ListNode h = new ListNode(0);
        ListNode nex = h;
        
        while(n1!=null && n2!=null){
            if(n1.val<n2.val){
                nex.next = n1;
                n1 = n1.next;
            }else{
                nex.next = n2;
                n2 = n2.next;
            }
            nex=nex.next;
        }
        if(n1!=null && n2==null){
            nex.next = n1;
        }
        if(n1==null && n2!=null){
            nex.next = n2;
        }
        return h.next;
    }
}
