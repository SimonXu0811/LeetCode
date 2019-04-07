/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
    ListNode cur = new ListNode(0);
    cur.next = head;//防止要删除的就是head
    ListNode first = cur;//第一个指针
    ListNode second = cur;//第二个指针
    for (int i = 1; i <= n + 1; i++) {//首先将第一个指针移动n个位置
        first = first.next;
    }
    while (first != null) {//然后一起移动，直到第一个指针到最后，这样第二个指针还剩n个位置
        first = first.next;
        second = second.next;
    }
    second.next = second.next.next;//删除节点
    return cur.next;
}
}

/*
时间复杂度:O(n)
空间复杂度:O(1)
*/
