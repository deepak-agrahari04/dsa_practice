/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode prev=null;
        ListNode f_head = head.next;
        ListNode s = head;
        ListNode f = head.next;
       
        while(s != null && f!=null){
           ListNode third = f.next;
           s.next = third;
           f.next = s;
           if(prev!=null){
           prev.next = f;
           }
           else{
            head = f;
           }
           prev=s;
           s=third;
           if(third!=null){
            f=third.next;
           }
           else{
            f = null;
           }  
        }
        return head;
    }
}