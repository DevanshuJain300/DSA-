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
    public ListNode findMid(ListNode head){
        ListNode slow=head;
        ListNode fast =head;
        while(fast!=null && fast.next !=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }
    public boolean isPalindrome(ListNode head) {
        if(head==null && head.next==null){
            return true;
        }
        ListNode mid=findMid(head);
        ListNode curr=mid;
        ListNode prev=null;
        while(curr!=null){
            ListNode nextN=curr.next;
            curr.next=prev;
            prev=curr;
            curr=nextN;
        }
        ListNode right=prev;
        ListNode left=head;
        while(right!=null){
            if(left.val!=right.val){
                return false;
            }
            right=right.next;
            left=left.next;
        }
        return true;
    }
}