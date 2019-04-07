/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
    ListNode dummy = new ListNode(0);
    dummy.next = head;//0->A->B->C->D
    ListNode current = dummy;//临时链表用来储存第一个指针0
    while (current.next != null && current.next.next != null) {
        ListNode first = current.next;//第二个指针A
        ListNode second = current.next.next;//第三个指针B
        first.next = second.next;//指向第三个指针后面A->C
        current.next = second;//头指针指向第三个指针0->B
        current.next.next = first;//B->A
        current = current.next.next;//移动第一个指针C
    }
    return dummy.next;
}
}

/*
时间复杂度:O(n)
空间复杂度:O(n)
*/
