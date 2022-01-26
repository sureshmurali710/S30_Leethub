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
        k = k -1;
        
        ListNode faster = head;
        
        while(k>0){
            faster = faster.next;
            k--;
        }
        
        ListNode fast = faster;
        ListNode slow = head;
        
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        
        int temp = slow.val;
        slow.val =  faster.val;
        faster.val = temp;
        
        return head;
    }
}