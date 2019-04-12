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
    int res = 0;
    public int findTilt(TreeNode root) {
        PostOrder(root);//后序遍历
        return res;
    }
    
    private int PostOrder(TreeNode root){
        if(root == null){//回溯的起点
            return 0;
        }
        int left = PostOrder(root.left);
        int right = PostOrder(root.right);
        res += Math.abs(right - left);//两个取差值
        return left + right + root.val;//返回到根节点把两个加起来
    }
}

/*
时间复杂度:O(n)
空间复杂度:O(n)
*/
