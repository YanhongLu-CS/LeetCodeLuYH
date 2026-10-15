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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        Queue<ListNode> q = new LinkedList<>();
        ListNode p = head;
        while (p != null) {
            if (q.size() < n + 1) q.offer(p);
            else if (q.size() == n + 1) {
                q.poll();
                q.offer(p);
            }
            p = p.next;
        }
        if (q.size() == n) {
            return head.next;
        } else {
            q.peek().next = q.peek().next.next;
            return head;
        }
    }
}