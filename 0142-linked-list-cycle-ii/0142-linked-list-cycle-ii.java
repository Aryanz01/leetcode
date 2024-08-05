/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode fast=head;
        ListNode slow=head;
        boolean y=false;
        ListNode check=head;
        
        // if(head==null || head.next==null){
        //     return head;
        // }
        
        while(fast != null && fast.next != null){
            fast=fast.next.next;
            slow=slow.next;
           
            
            if(fast==slow){
                y=true;
                break;
                //return fast;
            }
            
        }
        
        
        if(y==true){
            
            while(fast != check){
                fast=fast.next;
                check=check.next;
                
                
            }
            
            return check;   
        }
        else{
            return null;
        }
        
        
        
        //return fast;
        
    }
}