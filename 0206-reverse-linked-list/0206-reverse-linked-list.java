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
    public ListNode Helper(ListNode curr,ListNode prev){
        if(curr==null){
        return prev;
        }
        ListNode nextN=curr.next;
        curr.next=prev;
            prev=curr;
            curr=nextN;
            return Helper(curr,prev);
    }
    public ListNode reverseList(ListNode head) {
        return Helper(head,null);
        // ListNode curr=head;
        // ListNode prev=null;
        // // while(curr!=null){
        // //     ListNode nextN=curr.next;
        // //     curr.next=prev;
        // //     prev=curr;
        // //     curr=nextN;
        // }
        // return prev;
    }
}