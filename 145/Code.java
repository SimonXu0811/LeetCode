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
    List<Integer> list = new ArrayList<>();
    public List<Integer> postorderTraversal(TreeNode root) {
        if(root == null){
            return list;
        }
        postorderTraversal(root.left);//左右
        postorderTraversal(root.right);
        list.add(root.val);//加入根节点
        return list;
    }
}

/*
时间复杂度:O(n)
空间复杂度:O(n)
*/
