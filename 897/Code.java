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
    TreeNode cur;
    public TreeNode increasingBST(TreeNode root) {
        TreeNode ans = new TreeNode(0);//创建一个新的树
        cur = ans;
        inorder(root);//中序遍历
        return ans.right;
    }

    public void inorder(TreeNode node) {
        if (node == null) return;
        inorder(node.left);
        node.left = null;//把左节点设为空
        cur.right = node;//插入到右节点中
        cur = node;//继续遍历
        inorder(node.right);
    }
}

/*
时间复杂度:O(n)
空间复杂度:O(h)
*/
