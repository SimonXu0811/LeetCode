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

    private TreeNode getSuccessor(TreeNode node) {
        TreeNode succ = node.right;
        while (succ.left != null && succ.left != node) {//去找最小的节点
            succ = succ.left;
        }
        return succ;
    }

    public TreeNode convertBST(TreeNode root) {
        int sum = 0;
        TreeNode node = root;

        while (node != null) {
            if (node.right == null) {//如果没有右子树的话，那么就直接从上向下遍历加起来
                sum += node.val;
                node.val = sum;
                node = node.left;
            }
            else {//如果有右树的话，那么就先找到最右下角的一个子节点
                TreeNode succ = getSuccessor(node);
                if (succ.left == null) {//如果只有左子树的话，就直接加过去
                    succ.left = node;
                    node = node.right;
                }
                else {//如果有左子树的话，那么就从右开始加等到左下方
                    succ.left = null;
                    sum += node.val;
                    node.val = sum;
                    node = node.left;
                }
            }
        }
        
        return root;
    }
}

/*
时间复杂度:O(n)
空间复杂度:O(1)
*/
