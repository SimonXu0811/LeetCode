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
    public int longestUnivaluePath(TreeNode root) {
        ans = 0;
        DFS(root);//后序遍历
        return ans;
    }
    public int DFS(TreeNode node) {
        if (node == null) return 0;
        int left = DFS(node.left);//左子树
        int right = DFS(node.right);//右子树
        int l = 0, r = 0;
        if (node.left != null && node.left.val == node.val) {//如果左子树有符合条件的，那就加一
            l += left + 1;
        }
        if (node.right != null && node.right.val == node.val) {//右子树符合条件的
            r += right + 1;
        }
        ans = Math.max(ans, l + r);//最后返回的值
        return Math.max(l, r);//一层一层返回父节点
    }
}

/*
时间复杂度:O(n)
空间复杂度:O(1)
*/
