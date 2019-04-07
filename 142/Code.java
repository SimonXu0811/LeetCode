/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
           ListNode slow = head;//慢指针
           ListNode fast = head;//快指针
        
           while (fast!=null && fast.next!=null){//是循坏的链表
              fast = fast.next.next;//速度为2
              slow = slow.next;//速度为1
                    
              if (fast == slow){//如果有相等的了
                  ListNode slow2 = head; 
                  while (slow2 != slow){//再遍历一次找到索引
                      slow = slow.next;
                      slow2 = slow2.next;
              }
               return slow;
          }
        }
      return null;
    }
}

/*
时间复杂度:O(n)
空间复杂度:O(1)
*/
