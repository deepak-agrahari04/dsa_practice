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
    public int getDecimalValue(ListNode head) {
       /*  int sum = 0;
        int i = 0;
      Stack<Integer>stack = new Stack<>();
      ListNode temp = head;
      while(temp != null){
        stack.push(temp.val);
        temp = temp.next;
      }  
      for(Integer item:stack){
        sum = sum + (int)(Math.pow(2,i))*item;
        i++;
      }
      return sum; */

      /* int len = 0;
      ListNode temp = head;
      int sum= 0;
      while(temp != null){
        len++;
        temp = temp.next;
      } 
      int i = len - 1;
      temp = head;
      while(temp != null){
        
           sum = sum + (int)(Math.pow(2,i))*temp.val;
           temp = temp.next;
           i--;
      }
      return sum; */

      int res = 0;                       
      while(head!=null){        // 345
        res = res*2+head.val;  // 0*10+3=3
        head = head.next;     // 3*10+4=34
      }                      //34*10+5=345 only base is different.
      return res;
    }
}
