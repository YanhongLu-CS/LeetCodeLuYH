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
        ListNode pa = headA, pb = headB;
        if (pa == null || pb == null) return null;
        else if (pa == pb) return pa;
        while (pa != null || pb != null) {
            if (pa == pb) return pa;
            if (pa == null) pa = headB;
            else pa = pa.next;
            if (pb == null) pb = headA;
            else pb = pb.next;
        }
        return null;
    }
}