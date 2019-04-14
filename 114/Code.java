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
   private TreeNode prev = null;

   public void flatten(TreeNode root) {
    if (root == null)//空树，返回
        return;
    flatten(root.right);//后序遍历，颠倒返回保存到树中
    flatten(root.left);
    root.right = prev;//只保留右节点
    root.left = null;//左节点为空
    prev = root;
}
}

/*
时间复杂度:O(n)
空间复杂度:O(1)
*/
