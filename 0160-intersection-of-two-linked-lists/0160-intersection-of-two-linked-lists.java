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
        Set<ListNode> s = new HashSet<>();
        ListNode p = headA;
        while(p != null) {
            s.add(p);
            p = p.next;
        }
        p = headB;
        while(p != null) {
            if(s.contains(p)) return p;
            p = p.next;
        }
        return null;
    }
}