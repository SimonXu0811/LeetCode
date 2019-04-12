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
    public boolean hasPathSum(TreeNode root, int sum) {
        if(root == null){//回溯条件
            return false;
        }
        if(root.left == null && root.right == null && root.val == sum){//如果到了叶子结点并且找到了那个元素，就是true
            return true;
        }
        return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);//遍历到叶子结点
    }
}

/*
时间复杂度:O(h)
空间复杂度:O(h)
*/
