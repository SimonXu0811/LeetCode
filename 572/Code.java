/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isSubtree(TreeNode s, TreeNode t) {
        String tree1 = preorder(s);//s转成字符串
        String tree2 = preorder(t);//t转成字符串
        return tree1.indexOf(tree2) != -1;//如果树中没有索引的话
    }
    private String preorder(TreeNode t) {//前序遍历
        if (t == null) {//返回的条件
            return "null";
        }
        return "#" + t.val + "" + preorder(t.left) + "" + preorder(t.right);//把根节点定义，不然就会误判
    }
}

/*
时间复杂度:O(n^2)
空间复杂度:O(n)
*/
