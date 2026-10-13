/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> s = new HashSet<>();
        ListNode p = head;
        while (p != null) {
            if (s.contains(p)) return true;
            s.add(p);
            p = p.next;
        }
        return false;
    }
}