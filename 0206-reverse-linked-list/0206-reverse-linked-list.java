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
    //     if(head==null){
    //         return head;
    //     }
    //     if(head.next==null){
    //         return head;
    //     }
    //   ListNode head1=reverseList(head.next);
    //    head.next.next=head;
    //    head.next=null;
    //    return head1;
    ////************************************************************////
    //By Iterative Method//
    
        if(head==null || head.next==null){
            return head;
        }
        ListNode prevNode=null;
        ListNode currNode=head;
        while(currNode != null){
            ListNode temp=currNode.next;
            currNode.next=prevNode;
            prevNode=currNode;
            currNode=temp;
        }
        return prevNode;
    }
}