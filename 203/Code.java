/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) return null;//直到遍历到最后
        head.next = removeElements(head.next, val);//递归遍历
        return head.val == val ? head.next : head;//如果值相同，那么就删除否则返回到递归上一层
}
}

/*
时间复杂度:O(n)
空间复杂度:O(1)
*/
