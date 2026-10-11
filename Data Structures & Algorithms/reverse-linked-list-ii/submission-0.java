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
    public ListNode reverse(ListNode head){
        ListNode temp = head;
        ListNode prev = null;
        while(temp!=null){
            ListNode curr = temp.next;
            temp.next = prev;
            prev = temp;
            temp =curr;
        }
        return prev;
    }
    public ListNode reverseBetween(ListNode head, int left, int right) {
        int pos =1;
       
        ListNode curr = head;
        ListNode prev = null; 
        while(pos<left){
            prev = curr;
            curr= curr.next;
            pos++;
        }
        ListNode leftNode = prev;
        ListNode  nextleft = curr;

        while(pos<right){
            curr = curr.next;
            pos++;
        }
        ListNode rightNode =curr;
        ListNode nextrightNode = curr.next; 

        rightNode.next = null;
        ListNode first = nextleft;

        nextleft = reverse(nextleft);
        if (leftNode != null) {
            leftNode.next = nextleft;
        } else {
            head = nextleft;
        }
       first.next = nextrightNode;

        return head;
    }
}