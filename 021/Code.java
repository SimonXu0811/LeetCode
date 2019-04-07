class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2){
		if(l1 == null) return l2;//如果为空或者遍历结束了，那么就返回l2
		if(l2 == null) return l1;
		if(l1.val < l2.val){//哪个小就保留哪个
			l1.next = mergeTwoLists(l1.next, l2);
			return l1;
		} else{
			l2.next = mergeTwoLists(l1, l2.next);
			return l2;
		}
}
}

/*
时间复杂度:O(n)
空间复杂度:O(1)
*/
