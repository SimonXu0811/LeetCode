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
        ListNode cur = head;//用来移动指针
        while(cur != null && cur.next != null){//如果不为空或者后面还有数的话
            if(cur.val ==  cur.next.val){//如果这个与后面那个相等
                cur.next = cur.next.next;//跳过
            }else{
                cur = cur.next;//否则继续遍历
            }
        }
        return head;
    }
}

/*
时间复杂度:O(n)
空间复杂度:O(1)
*/
