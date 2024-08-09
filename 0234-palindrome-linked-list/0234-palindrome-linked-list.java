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
    public boolean isPalindrome(ListNode head) {
        if(head==null || head.next==null){
            return true;
        }
        
        ListNode fast=head;
        ListNode slow=head;
        
        while(fast != null && fast.next != null){
            slow=slow.next;
            fast=fast.next.next;
        }
        
        ListNode curr =slow;
        ListNode prev =null;
        
        while(curr != null){
            ListNode forward =curr.next;
            curr.next=prev;
            prev=curr;
            curr=forward;
            
        }
        
        ListNode firsthalf =head;
        ListNode secondhalf = prev;
        
        while(secondhalf != null){
            if(firsthalf.val != secondhalf.val){
                return false;
            }
            firsthalf= firsthalf.next;
            secondhalf=secondhalf.next;
        }
        
        return true;
        
        
        
    }
}