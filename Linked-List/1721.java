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
    public ListNode swapNodes(ListNode head, int k) {
        int size = 0;
        ListNode temp = head;
        while(temp != null){
            size++;
            temp = temp.next;
        }
        ListNode k1 = head;
        ListNode k2 = head;
        for(int i = 1;i<k;i++){
            k1 = k1.next;
        }
        for(int i = 1;i <= size-k;i++){
            k2 = k2.next;
        }
        int val1 = k1.val;
        k1.val = k2.val;
        k2.val = val1;
        return head;
    }
}