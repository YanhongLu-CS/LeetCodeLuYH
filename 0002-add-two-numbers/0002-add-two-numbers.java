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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return help(l1, l2, false);
    }
    private ListNode help(ListNode l1, ListNode l2, boolean carry) {
        if (l1 == null && !carry) {
            return l2;
        } else if (l1 == null && carry) {
            return help(new ListNode(1), l2, false);
        } else if (l2 == null && !carry) {
            return l1;
        } else if (l2 == null && carry) {
            return help(l1, new ListNode(1), false);
        } else if (!carry) {
            if (l1.val + l2.val < 10) {
                ListNode cur = new ListNode();
                cur.val = l1.val + l2.val;
                cur.next = help(l1.next, l2.next, false);
                return cur;
            } else {
                ListNode cur = new ListNode();
                cur.val = l1.val + l2.val - 10;
                cur.next = help(l1.next, l2.next, true);
                return cur;
            } 
        } else if (carry) {
            if (l1.val + l2.val + 1 < 10) {
                ListNode cur = new ListNode();
                cur.val = l1.val + l2.val + 1;
                cur.next = help(l1.next, l2.next, false);
                return cur;
            } else {
                ListNode cur = new ListNode();
                cur.val = l1.val + l2.val + 1 - 10;
                cur.next = help(l1.next, l2.next, true);
                return cur;
            }
        } else {
            return null;
        }
    }
}