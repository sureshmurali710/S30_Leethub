/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int Asize = 0;
        int Bsize = 0;
        
        ListNode fast = headA;
        
        while(fast != null){
            fast = fast.next;
            Asize++;
        }
        
        fast = headB;
        
        while(fast != null){
            fast = fast.next;
            Bsize++;
        }
        
        fast = headA;
        
        while(Asize > Bsize){
            fast = fast.next;
            Asize--;
        }
        
        
        ListNode slow = headB;
        
         while(Bsize > Asize){
            slow = slow.next;
            Bsize--;
        }
    
        
        while(fast != slow){
            slow = slow.next;
            fast = fast.next;
        }
        
        return slow;
        
        
        
        
        
        
    }
}