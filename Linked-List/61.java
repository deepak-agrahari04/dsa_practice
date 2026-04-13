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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode temp = head;
        ListNode tail = head;
        int len = 0;
        int n;
        if(head == null || head.next == null) return head;
        while(temp != null){
            len++;
            temp = temp.next;
        }
        
        n = k%len;
        if(n == 0) return head;
        while(tail.next != null){
            tail = tail.next;
        }
        tail.next = head;
        int pos = len-n;
        temp = head;
        for(int i =0;i<pos-1;i++){
            temp = temp.next;
        }
        head = temp.next;
        temp.next = null;
        return head;
    }
}