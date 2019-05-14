/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) return head;
        ListNode dumhead = new ListNode(0);
        dumhead.next = head;
        ListNode back = dumhead;
        ListNode cur = dumhead;
        int len = 0;
        
        while(cur.next != null){//首先计算出长度
            cur = cur.next;
            len++;
        }
        
        int count = len - k % len;//找到开始旋转的位置
        
        for(int i = count; i > 0; i--){//找到旋转节点后面的链表
            back = back.next;
        }
        
        cur.next = dumhead.next;//旋转
        dumhead.next = back.next;
        back.next = null;
        
        return dumhead.next;
        
    }
}

/*
时间复杂度:O(n)
空间复杂度:O(1)
*/
