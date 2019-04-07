/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
    ListNode fast = head, slow = head;//快慢两个指针
    while (fast != null && fast.next != null) {//一个+1一个+2
        fast = fast.next.next;
        slow = slow.next;
    }
    if (fast != null) { //如果是奇数的话，那么就再加一个
        slow = slow.next;
    }
    slow = reverse(slow);//从慢指针为界限，后半部分旋转，前半部分正常遍历
    fast = head;
    
    while (slow != null) {
        if (fast.val != slow.val) {//如果值不等就false
            return false;
        }
        fast = fast.next;//继续移动
        slow = slow.next;
    }
    return true;
}

public ListNode reverse(ListNode head) {
    ListNode prev = null;
    while (head != null) {//A->B->C->D->E
        ListNode next = head.next;//B
        head.next = prev;pre //A->null
        prev = head;
        head = next;//B->A
    }
    return prev;
}
}

/*
时间复杂度:O(n)
空间复杂度:O(1)
*/
