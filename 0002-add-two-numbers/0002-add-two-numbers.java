class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return help(l1, l2, 0);
    }

    private ListNode help(ListNode l1, ListNode l2, int carry) {
        if (l1 == null && l2 == null && carry == 0) {
            return null;
        }

        int sum = carry;

        if (l1 != null) {
            sum += l1.val;
        }

        if (l2 != null) {
            sum += l2.val;
        }

        ListNode cur = new ListNode(sum % 10);

        cur.next = help(
            l1 == null ? null : l1.next,
            l2 == null ? null : l2.next,
            sum / 10
        );

        return cur;
    }
}