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
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root == null){//返回的条件
            return list;
        }
        inorderTraversal(root.left);//先左
        list.add(root.val);//加上中间的值
        inorderTraversal(root.right);//再右
        return list;
    }
}

/*
时间复杂度:O(n)
空间复杂度:O(n)
*/
