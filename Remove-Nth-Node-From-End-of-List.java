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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast= head;
        ListNode slow= head;
        ListNode prev= null;
        int cnt = n;
        
        if(head==null || head.next==null){
            return null;
        }
        
        while(cnt != 0){
            fast=fast.next;
            cnt--;
        }
        if(fast==null){
            return head.next;
        }
        while(fast !=null){
            
            prev=slow;
            slow=slow.next;
            fast=fast.next;
            
        }
       
        prev.next=slow.next;
        
        
        return head;
        
        
    }
}