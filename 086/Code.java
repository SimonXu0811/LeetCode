/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode dumhead = new ListNode(0);
        ListNode temp = dumhead;//新的链表
        ListNode cur = head;//第一遍扫描
        ListNode scan = cur;//第二遍扫描，在cur改动的基础上
        while(cur != null){//扫面所有的值
            if(cur.val < x){//小的就赋值给新的链表
                temp.next = new ListNode(cur.val);
                temp = temp.next;
                cur.val = Integer.MIN_VALUE;//设为最小值
            }
            cur = cur.next;//继续移动
        }
       while(scan != null){//第二遍扫描
           if(scan.val != Integer.MIN_VALUE){//将未变动的保存
               temp.next = new ListNode(scan.val);
               temp = temp.next;
           }
           scan = scan.next;
       }
        return dumhead.next;
    }
}

/*
时间复杂度:O(n)
空间复杂度:O(1)
*/
