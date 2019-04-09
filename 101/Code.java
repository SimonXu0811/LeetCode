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
    public boolean isSymmetric(TreeNode root) {
        return Check(root,root);//调用方法
    }
    
    private boolean Check (TreeNode t1, TreeNode t2){//递归
        if(t1 == null && t2 == null) return true;//都为空就是镜像的
        if(t1 == null || t2 ==null) return false;//一空一不空那么肯定不是镜像的
        
        return (t1.val == t2.val) && Check(t1.left, t2.right) && Check(t1.right, t2.left);//先左半边DFS，然后回上一层右半边DFS
    }
}

/*
时间复杂度:O(n)
空间复杂度:O(n)
*/
