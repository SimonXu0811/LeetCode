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
    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null) return 0;
        int sum = 0;
        if(root.left != null && root.left.left ==null && root.left.right ==null){//判断是不是叶子结点
            sum += root.left.val;//如果符合就加起来
        }else{
            sum += sumOfLeftLeaves(root.left);//继续遍历下面的结点
        }
        sum += sumOfLeftLeaves(root.right);//找右子树
        return sum;
    }
}

/*
时间复杂度:O(logn)
空间复杂度:O(n)
*/
