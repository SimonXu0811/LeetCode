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
    int ans;
    public int diameterOfBinaryTree(TreeNode root) {
        ans = 1;
        depth(root);//找到左右的最大深度和
        return ans - 1;//减去一个重复的根节点
    }
    public int depth(TreeNode node) {
        if (node == null) return 0;
        int L = depth(node.left);//一直到左侧的最深处
        int R = depth(node.right);//一直到右侧的最深处
        ans = Math.max(ans, L+R+1);//得到最大的左右深度之和
        return Math.max(L, R) + 1;
    }
}

/*
时间复杂度:O(n)
空间复杂度:O(n)
*/
