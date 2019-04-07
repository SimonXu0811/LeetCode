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
    if (head == null || head.next == null) {
        return false;
    }//临界条件
    ListNode slow = head;
    ListNode fast = head.next;
    while (slow != fast) {
        if (fast == null || fast.next == null) {//fast只要遍历到了null，那么就是非循环的
            return false;
        }
        slow = slow.next;//慢指针速度为1
        fast = fast.next.next;//快指针速度为2
    }
    return true;//如果追上了那么肯定就是循环的
}
}

/*
时间复杂度:O(n)
空间复杂度:O(1)
*/
