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
        ListNode temp=head;
        int cnt=1;
        int cut=0;
        
        if(head==null || head.next==null || k==0){
            return head;
        }
        
        while( temp.next != null){
            cnt++;
            temp=temp.next;
        }
        temp.next=head;
        k=k%cnt;
        cut=cnt-k;
        
        while(cut-- > 0){
            temp=temp.next;
        }    
        
        head= temp.next;
        temp.next=null;
        
        return head;
        
    }
}