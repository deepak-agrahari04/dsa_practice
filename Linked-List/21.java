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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

       /* ArrayList<Integer> arr = new ArrayList<>();  //brute force approach//
        while(list1!=null){
            arr.add(list1.val);
            list1 = list1.next;
        }
         while(list2!=null){
            arr.add(list2.val);
            list2 = list2.next;
        }
        Collections.sort(arr);
        
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        for(int val:arr){
            temp.next = new ListNode(val);
            temp = temp.next;
        }
        return dummy.next; */
        ListNode t1 = list1;
        ListNode t2 = list2;
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        while(t1!=null && t2!=null){
            if(t1.val<t2.val){
                temp.next = t1;
                t1 = t1.next;
            }
            else{
                temp.next = t2;
                t2 = t2.next;
            }
            temp = temp.next;
        }
        if (t1 != null){
            temp.next = t1;
        }
        else{
            temp.next = t2;
        }
        return dummy.next;
    }
}