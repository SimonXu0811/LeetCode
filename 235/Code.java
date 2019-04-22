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
        int valp = p.val;
        int valq = q.val;
        TreeNode node = root;
        
        while(node != null){//迭代法
            int valnode = node.val;
            if(valnode < valp && valnode < valq){//都大于根节点，就向右子树移动
                node = node.right;
            }
            else if(valnode > valp && valnode > valq){//都小于就向左子树移动
                node = node.left;
            }
            else return node;//否则就的到节点
        }
        return null;
    }
}

/*
时间复杂度:O(n)
空间复杂度:O(1)
*/
