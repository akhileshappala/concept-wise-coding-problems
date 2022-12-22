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
    public void reorderList(ListNode head) {
        // 1. Finding the middle using fast and slow pointer

        ListNode slow = head;
        ListNode fast = head.next;
        while(fast !=null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        //Now 2nd half starts from slow.next
        ListNode second = slow.next;
        slow.next = null;
        ListNode prev = null;
        //2. Reverse the second half
        while(second!= null){
            ListNode temp = second.next;
            second.next = prev;
            prev = second;
            second = temp;
        }

        // 3. merge both the list 1 is from 0 to half and 
        //other is from reversed half to end

        ListNode first = head;
        second = prev; // this will be last node after reversal  i.e 1st 
        while(second != null){
            ListNode temp1 = first.next;
            ListNode temp2 = second.next;
            
            first.next = second;
            second.next = temp1;
            first = temp1;
            second = temp2;
        }

    }
}
