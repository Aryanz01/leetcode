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
    public ListNode removeNodes(ListNode head){
        
         if (head == null) {
            return null;
        }
        
        
        ListNode reversed = reverseList(head);
      //  ListNode nhead =new ListNode(reversed.val);
        ListNode curr = reversed;
     // Listnode curr_n = nhead.next;
        int max=reversed.val;
        
        while(curr != null && curr.next != null){
            if(curr.next.val<max){
                curr.next=curr.next.next;
               
            }else{
                max=curr.next.val;
                curr=curr.next;
        }
        
    }
        
        return reverseList(reversed);
    }
        
        
private ListNode reverseList(ListNode head){
            ListNode currn =head;
            ListNode prev =null;
            ListNode forward;
            
            while(currn != null){
                forward =currn.next;
                currn.next=prev;
                prev =currn;
                currn=forward;
                
            }
            return prev;
        }
        
        
    }




/*
class Solution {
    public ListNode removeNodes(ListNode head) {
        ListNode temp=head;
        ListNode prev =head;
        
        if(head==null || head.next== null){
            return head;
        }
        
        while(temp != null &&  temp.next !=null){
            
            if(temp.next.val > temp.val){
                
                prev=temp.next;
                temp.next=null;
            }
            prev=temp;
            
            temp=temp.next;
            
            
        }
        
        return head;
    }
}

*/