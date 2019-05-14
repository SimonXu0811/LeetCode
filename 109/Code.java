/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        int len = 0;
        ListNode cur = head;
        while(cur != null){
            cur = cur.next;
            len++;
        }//先找到长度
        if(len == 0) return null;
        
        int[] nums = new int[len];
        for(int i = 0; i < len; i++){
            nums[i] = head.val;
            head = head.next;
        }//然后转换成数组
        
        Arrays.sort(nums);//排好序
        TreeNode root = Builder(nums, 0, len - 1);//构建
        
        return root;
    }
    
    private TreeNode Builder(int[] nums, int low, int high){
        if(low > high) return null;
        
        int mid = (low + high) / 2;//找根节点
        TreeNode root = new TreeNode(nums[mid]);
        root.left = Builder(nums, low, mid - 1);//左子树
        root.right = Builder(nums, mid + 1, high);//右子树
        
        return root;
    }
}

/*
时间复杂度:O(nlogn)
空间复杂度:O(n)
*/
