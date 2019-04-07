/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;//复制后面的值到当前节点
        node.next = node.next.next;//删除后面的节点
    }
}

/*
时间复杂度:O(1)
空间复杂度:O(1)
*/
