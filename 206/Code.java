/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode pre = null;//初始节点
        ListNode cur = head;//当前节点
        while(cur != null){//一直遍历到最后
            ListNode temp = cur.next;//后一个节点
            cur.next = pre;//链接的旋转
            pre = cur;
            cur = temp;
        }
        return pre;
    }
}

/*
时间复杂度:O(n)
空间复杂度:O(1)
*/
