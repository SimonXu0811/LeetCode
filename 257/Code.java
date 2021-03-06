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
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new LinkedList<>();
        if(root == null) return paths;
        if(root.left == null && root.right == null){//如果是叶子结点，那么就直接加树的值
            paths.add(root.val+"");
            return paths;
        }

         for (String path : binaryTreePaths(root.left)) {//遍历左子树，每次都是val->
             paths.add(root.val + "->" + path);
         }

         for (String path : binaryTreePaths(root.right)) {//遍历右子树
             paths.add(root.val + "->" + path);
         }

         return paths;
        
    }
}

/*
时间复杂度:O(n)
空间复杂度:O(n)
*/
