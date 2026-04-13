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
        ListNode r=headA;
        ListNode l=headB;
        while(r!=l){
            if(r==null){
                r=headB;
            }
            else{
            r=r.next;}
             if(l==null){
                l=headA;
            }
            else{
            l=l.next;}
        }
        return r;
    }
}