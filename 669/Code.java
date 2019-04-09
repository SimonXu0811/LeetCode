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
    public TreeNode trimBST(TreeNode root, int L, int R) {
        if(root == null) return root;//空树
        if(root.val > R) return trimBST(root.left, L, R);//结点值比区间大，那么删右子树
        if(root.val < L) return trimBST(root.right, L, R);//结点值比区间小，删左子树
        
        root.left = trimBST(root.left, L, R);//继续遍历左子树
        root.right = trimBST(root.right, L, R);//继续遍历右子树
        return root;
    }
}

/*
时间复杂度:O(logn)
空间复杂度:O(1)
*/
