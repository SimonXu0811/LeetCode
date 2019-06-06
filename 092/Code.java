/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int m, int n) {
        if(head == null) return null;
        ListNode dumhead = new ListNode(0);
        dumhead.next = head;//防止头元素要旋转
        ListNode pre = dumhead;
        ListNode cur = dumhead;
        
        for(int i = 0; i < m; i++){//找到第m个元素和m元素的前一个元素
            pre = cur;
            cur = cur.next;
        }
        for(int i = m; i <  n; i++){//三指针旋转链表
            ListNode temp = cur.next;
            cur.next = temp.next;
            temp.next = pre.next;
            pre.next = temp;
        }
        
        return dumhead.next;
    }
}


/*
时间复杂度:O(n)
空间复杂度:O(1)
*/
