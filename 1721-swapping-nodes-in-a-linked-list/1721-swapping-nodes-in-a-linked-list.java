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
    public ListNode swapNodes(ListNode head, int k) {
        // Step 1: Traverse the list to find the k-th node from the beginning
        ListNode first = head;
        for (int i = 1; i < k; i++) {
            first = first.next;
        }
        
        // Step 2: Use two pointers to find the k-th node from the end
        ListNode slow = head;
        ListNode fast = first;
        while (fast.next != null) {
            slow = slow.next;
            fast = fast.next;
        }
        
        // Step 3: Swap the values of the k-th node from the start and the k-th node from the end
        int temp = first.val;
        first.val = slow.val;
        slow.val = temp;
        
        return head;
    }
}
