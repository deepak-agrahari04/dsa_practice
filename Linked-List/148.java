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
    public ListNode sortList(ListNode head) {
        
        /* ArrayList<Integer>arr = new ArrayList<>();
        ListNode temp = head;
        while(temp != null){
            arr.add(temp.val);
            temp = temp.next;
        }
         Collections.sort(arr);
         temp = head;
        for(int i =0;i<arr.size();i++){
           temp.val = arr.get(i);
           temp = temp.next;
        }
        return head;  */
 
     if (head == null || head.next == null) return head;

        // Step 1: find middle
        ListNode mid = findMid(head);
        ListNode rightHead = mid.next;
        mid.next = null;          // split list

        // Step 2: sort both halves
        ListNode left = sortList(head);
        ListNode right = sortList(rightHead);

        // Step 3: merge
        return merge(left, right);
    }

    // Find middle using slow-fast pointer
    private ListNode findMid(ListNode head) {
        ListNode slow = head;
        ListNode fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; // mid (end of left half)
    }

    // Merge two sorted lists
    private ListNode merge(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;

        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                cur.next = l1;
                l1 = l1.next;
            } else {
                cur.next = l2;
                l2 = l2.next;
            }
            cur = cur.next;
        }

        if (l1 != null) cur.next = l1;
        if (l2 != null) cur.next = l2;

        return dummy.next;
    }
}