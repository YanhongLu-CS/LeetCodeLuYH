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
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null) return null;
        ListNode s = head, f = head;
        int count = 0;
        s = s.next;
        f = f.next.next;
        // slow进入loop之后的第一圈之内一定会与fast相遇
        // 因为每走一步，两个指针之间的距离减1
        while (f != null && f.next != null) {
            if (f == s) break;
            s = s.next;
            f = f.next.next;
        }
        if (f == null || f.next == null) return null;
        ListNode p = head;
        while (p != f) {
            p = p.next;
            f = f.next;
        }
        return p;
    }
}