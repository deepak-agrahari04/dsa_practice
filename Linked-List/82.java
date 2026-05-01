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
    public ListNode deleteDuplicates(ListNode head) {
        
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode curr = head;
        ListNode temp = dummy;

        if(head == null)return null;
        while(curr!=null){
            if(curr.next != null && curr.val == curr.next.val){
               while(curr.next!=null && curr.val == curr.next.val){
                 curr = curr.next;
            } 
            temp.next = curr.next;
            }
            else{
                temp = temp.next;
            }
            curr = curr.next;
        }
         return dummy.next;
    }
}