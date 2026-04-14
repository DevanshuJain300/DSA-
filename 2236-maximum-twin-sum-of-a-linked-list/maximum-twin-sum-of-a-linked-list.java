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
    public int pairSum(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        ListNode mid=slow;
        ListNode prev=null;
        while(mid!=null){
            ListNode nextN=mid.next;
            mid.next=prev;
            prev=mid;
            mid=nextN;
        }
        int maxSum=0;
        ListNode t1=head;
        ListNode t2=prev;
        while(t2!=null){
            maxSum=Math.max(maxSum, t1.val+t2.val);
            t1=t1.next;
            t2=t2.next;
        }
        return maxSum;
    }
}