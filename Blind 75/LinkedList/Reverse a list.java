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
    public ListNode reverseList(ListNode head) {
        //base case when we dont have any node or one node
        if(head == null || head.next == null){
            return head;
        }
         
        //secondElement(having list except 1st element)
        ListNode secondElement = head.next;
        //now separate the list into 2 parts, by doing 1st element.next = null, now 1st ele has one element and null in address, 
        // 2nd element has everything from the list other than 1st 
        head.next = null;
        //call reverseList on the second element
        ListNode reversedList = reverseList(secondElement);
        //merging the list with 1st  element
        secondElement.next = head;
        //return the reversed sublist
        return reversedList;
    }
}
