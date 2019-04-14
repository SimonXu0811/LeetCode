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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
    return helper(0, 0, inorder.length - 1, preorder, inorder);
}

    private TreeNode helper(int preStart, int inStart, int inEnd, int[] preorder, int[] inorder) {
    if (preStart > preorder.length - 1 || inStart > inEnd) {//如果两个索引不相同，那就是叶子结点 返回
        return null;
    }
    TreeNode root = new TreeNode(preorder[preStart]);
    int inIndex = 0; 
    for (int i = inStart; i <= inEnd; i++) {//中序中找到父节点
        if (inorder[i] == root.val) {
            inIndex = i;
        }
    }
    root.left = helper(preStart + 1, inStart, inIndex - 1, preorder, inorder);//构造左树
    root.right = helper(preStart + inIndex - inStart + 1, inIndex + 1, inEnd, preorder, inorder);//构造右树
    return root;
}
}

/*
时间复杂度:O(n)
空间复杂度:O(n)
*/
