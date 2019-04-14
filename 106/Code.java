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
    
    private int idx;
    
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder.length != postorder.length) return null;//两个不匹配的话，那么返回非树
        if (inorder.length == 0) return null;//空树
        idx = postorder.length-1;//根节点的索引
        TreeNode root = build(inorder, postorder, 0, idx);
        return root;
    }
    
    private TreeNode build(int[] inorder, int[] postorder, int start, int end) {
        if (start>end) return null;/叶子结点了
        TreeNode node = new TreeNode(postorder[idx--]);//先找到根节点
        if (start==end) return node;//找到了父节点
        
        int index = findIdx(inorder, node.val, end);//首先找父节点的索引呢
        node.right = build(inorder, postorder, index+1, end);//用索引向后利用后序遍历找节点
        node.left = build(inorder, postorder, start, index-1);//索引向前，用后序遍历找节点
        return node;
    }
    
    private int findIdx(int[] inorder, int val, int end) {//找索引值，前序遍历找父节点
        for (int i=end; i>=0; i--) {
            if (inorder[i]==val) return i;
        }
        return 0;
    }
}

/*
时间复杂度:O(n^2)
空间复杂度:O(n)
*/
