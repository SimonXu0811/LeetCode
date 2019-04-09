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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) { 
		 return traverse(root1).equals(traverse(root2));//判断两棵树的叶子节点是否相同
     }
    
	private String traverse(TreeNode root){
		 if(root == null) return "";//如果为空树，那就返回空
		 if(root.left == null && root.right == null) return root.val+"-";  //把叶子结点的值保存为字符串
		 return traverse(root.left)+traverse(root.right);//遍历左子树和右子树然后把所有的叶子节点加起来
    }
}

/*
时间复杂度:O(n)
空间复杂度:O(1)
*/
