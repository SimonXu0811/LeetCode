/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);//一个新的链表保存两数之和
        ListNode cur = head;//用来移动遍历
        int carry = 0;
        while(l1 != null || l2 != null){//有一个链表还有的情况
            int x = l1 != null? l1.val : 0;//如果没有了那么就等于0
            int y = l2 != null? l2.val : 0;
            int sum = x + y + carry;//每次都加一次进位
            carry = sum > 9? 1:0;//如果超过十了就为1
            cur.next = new ListNode(sum % 10);//剩下的就是余数
            cur = cur.next;//移动到下一位保存
            if(l1 != null) l1 = l1.next;//如果还有就向后移动
            if(l2 != null) l2 = l2.next;
        }
        if(carry == 1){//如果全部加完了还有进位，就向后再加一个进位
            cur.next = new ListNode(1);
        }
        return head.next;
    }
}

/*
时间复杂度:O(n)
空间复杂度:O(n)
*/
