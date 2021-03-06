/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode insertionSortList(ListNode head) {
		if( head == null ){
			return head;
		}
		
		ListNode helper = new ListNode(0); //dumhead用来保存pre节点
		ListNode cur = head; //从第一个开始记做cur
		ListNode pre = helper; 
		ListNode next = null; //用来保存下一个节点的
		while( cur != null ){//遍历链表
			next = cur.next;//更新next指针
			while( pre.next != null && pre.next.val < cur.val ){//如果后面的小前面的大，那就是这个位置要调整
				pre = pre.next;
			}
			cur.next = pre.next;//cur的连接断开，然后连到前面的pre
			pre.next = cur;//断开pre的连接，连到后面去
			pre = helper;//更新指针
			cur = next;//向后移动
		}
		
		return helper.next;
	}
}

/*
时间复杂度:O(n^2)
空间复杂度:O(1)
*/
