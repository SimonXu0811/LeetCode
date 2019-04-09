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
    int min1;
    long ans = Long.MAX_VALUE;

    public void dfs(TreeNode root) {
        if (root != null) {//非空树
            if (min1 < root.val && root.val < ans) {//如果该结点的值不是最小值，但是这个值比第二个最小值小，那么第二个最小值就等于这个结点值
                ans = root.val;
            } else if (min1 == root.val) {//否则改变最小值
                dfs(root.left);
                dfs(root.right);
            }
        }
    }
    public int findSecondMinimumValue(TreeNode root) {
        min1 = root.val;
        dfs(root);
        return ans < Long.MAX_VALUE ? (int) ans : -1;//如果都相等的话，那么久返回-1
    }
}

/*
时间复杂度:O(n)
空间复杂度:O(n)
*/
