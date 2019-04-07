/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    int lenA = length(headA), lenB = length(headB);//遍历找长度
    while (lenA > lenB) {//长度长的就向后遍历
        headA = headA.next;
        lenA--;
    }
    while (lenA < lenB) {
        headB = headB.next;
        lenB--;
    }
    while (headA != headB) {//找到相同相交的那个点
        headA = headA.next;
        headB = headB.next;
    }
    return headA;
}

private int length(ListNode node) {//遍历到最后找长度
    int length = 0;
    while (node != null) {
        node = node.next;
        length++;
    }
    return length;
}
}

/*
时间复杂度:O(n)
空间复杂度:O(1)
*/
