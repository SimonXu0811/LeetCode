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
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length == 0) return null;
        TreeNode root = Builder(nums, 0, nums.length - 1);
        return root;
    }
    
    private TreeNode Builder(int[] nums, int low, int high){
        if(low > high){//递归结束的标志
            return null;
        }
        int mid = (low + high) / 2;//找到根节点的位置
        TreeNode root = new TreeNode(nums[mid]);
        root.left = Builder(nums, low, mid - 1);//左边排小的数
        root.right = Builder(nums, mid + 1, high);//右边排大的数
        return root;
        
    }
}

/*
时间复杂度:O(n)
空间复杂度:O(n)
*/
