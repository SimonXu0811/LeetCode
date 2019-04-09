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
    public int minDepth(TreeNode root) {
    if (root == null) return 0;//空树
    int L = minDepth(root.left), R = minDepth(root.right);//遍历两棵子树
    return 1 + (Math.min(L, R) > 0 ? Math.min(L, R) : Math.max(L, R));//挑一个较短的子树继续向下移动
}
}

/*
时间复杂度:O(n)
空间复杂度:O(n)
*/
