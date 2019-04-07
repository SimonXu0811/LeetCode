/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {//临界情况
            return null;
        }
        return helper(lists, 0, lists.length - 1);//分治算法，分成最小的一个
    }
    private ListNode helper(ListNode[] lists, int start, int end) {
            if (start == end) {
                return lists[start];//分到不能再分了
            }
            int mid = (start + end) / 2;
            ListNode left = helper(lists, start, mid);//如果还有就继续
            ListNode right = helper(lists, mid + 1, end);
            return mergeTwo(left, right);//分到最后一个的时候开始回归合并
    }
    private ListNode mergeTwo(ListNode left, ListNode right) {//合并算法
        ListNode head = new ListNode(0);
        ListNode newHead = head;
        while (left != null && right != null) {//两个都还存在的情况
            if (left.val  <= right.val) {//哪个小就加哪个
                head.next = left;
                left = left.next;
            } else {
                head.next = right;
                right = right.next;
            }
            head = head.next;//继续向后移动加
        }
        if (left != null) {//如果一个没了，那么后面就直接加另一个
            head.next = left;
        }
        if (right != null) {
            head.next = right;
        }
        return newHead.next;
    }
}

/*
时间复杂度:O(knlogn)
空间复杂度:O(n)
*/
