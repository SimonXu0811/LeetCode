/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        
        ListNode slow = head;//快慢指针用来将链表一分为二
        ListNode fast = head;
        ListNode pre = null;//用来给最后一个节点加上null
        while(fast != null && fast.next != null){
            pre = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        pre.next = null;
        
        ListNode l1 = sortList(head);//再将两个一分为二，一直到单个的元素
        ListNode l2 = sortList(slow);

        return merge(l1,l2);//然后再两两的比大小合并起来
    }
    
    private ListNode merge(ListNode l1, ListNode l2){
        ListNode node = new ListNode(0);
        ListNode temp = node;
        
        while(l1 != null && l2 != null){//如果两个都还有的话
            if(l1.val <= l2.val){//哪个小就把哪个加进链表里
                temp.next = l1;
                l1 = l1.next;
            }else{
                temp.next = l2;
                l2 = l2.next;
            }
            temp = temp.next;
        }
        
        if(l1 != null){//如果一个链表空了，那么就直接在链表后面加
            temp.next = l1;
        }
        
        if(l2 != null){
            temp.next = l2;
        }
        
        return node.next;
    }
}

/*
时间复杂度:O(nlogn)
空间复杂度:O(1)
*/
