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
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root == null){
            return list;
        }
        list.add(root.val);//前序就是先加根几点
        preorderTraversal(root.left);//然后左右
        preorderTraversal(root.right);
        return list;
    }
}

/*
时间复杂度:O(n)
空间复杂度:O(n)
*/
