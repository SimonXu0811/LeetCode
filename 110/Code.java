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
    boolean res = true;
    public boolean isBalanced(TreeNode root) {
        Checkdiff(root);//查询最大深度
        return res;//判断是否深度差大于一
    }
    
    private int Checkdiff(TreeNode root){
        if(root == null) return 0;
        int max = 0;
        int left = Checkdiff(root.left);//向左遍历，达到最大深度
        int right = Checkdiff(root.right);//向右遍历，达到最大深度
        max = Math.abs(left - right);//获取两个最大深度的差值
        if(max > 1) res = false;//如果大于1了就是不平衡的
        return 1 + Math.max(left,right);//返回最大深度
    }
}

/*
时间复杂度:O(n)
空间复杂度:O(1)
*/
