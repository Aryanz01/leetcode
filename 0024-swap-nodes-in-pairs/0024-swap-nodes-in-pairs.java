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
    public ListNode swapPairs(ListNode head) {
        // Base case: if the list has less than two nodes, return the head as is
        if (head == null || head.next == null) {
            return head;
        }
        
        // Nodes to be swapped
        ListNode firstNode = head;
        ListNode secondNode = head.next;
        
        // Recursively swap the next pairs
        firstNode.next = swapPairs(secondNode.next);
        
        // Swap the current pair
        secondNode.next = firstNode;
        
        // Return the new head (secondNode after swapping)
        return secondNode;
    }
}
