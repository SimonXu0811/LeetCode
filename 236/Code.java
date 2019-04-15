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

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
      if (root == null || root == p || root == q) return root;//如果根节点就是其中一个节点的话，就直接返回根节点
      TreeNode left = lowestCommonAncestor(root.left, p, q);//深度遍历查找整棵树
      TreeNode right = lowestCommonAncestor(root.right, p, q);
      if(left == null && right == null) return null; //如果不存在于树中，就返回null
      if(left != null && right != null) return root;  //如果找到了共享的父节点，就返回
      return left == null ? right : left;//如果在一条直线上，就返回上层的一个
    }
}

/*
时间复杂度:O(n)
空间复杂度:O(n)
*/
