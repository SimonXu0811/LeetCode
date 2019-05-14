/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dumhead = new ListNode(0);
        dumhead.next = head;//新的链表用来删除相同的数值
        ListNode cur = head;
        ListNode temp = dumhead;
        while(cur != null){
            while(cur.next != null && cur.val == cur.next.val){//找到相同的数
                cur = cur.next;
            }
            if(temp.next == cur){//在新的链表中删除
                temp = temp.next;
            }
            else{//一起向后移动
                temp.next = cur.next;
            }
            cur = cur.next;//继续遍历原链表找元素是否重复
        }
        return dumhead.next;
    }
}

/*
时间复杂度:O(n^2)
空间复杂度:O(1)
*/
