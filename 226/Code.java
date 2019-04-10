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
    public TreeNode invertTree(TreeNode root) {
    if (root == null) return null;
    Queue<TreeNode> queue = new LinkedList<TreeNode>();//用来临时保存结点
    queue.add(root);//把结点加进队列中
    while (!queue.isEmpty()) {
        TreeNode current = queue.poll();//把当前该结点两两交换
        TreeNode temp = current.left;
        current.left = current.right;
        current.right = temp;
        if (current.left != null) queue.add(current.left);//然后向下继续遍历
        if (current.right != null) queue.add(current.right);
    }
    return root;
}
}

/*
时间复杂度:O(n)
空间复杂度:O(n)
*/
