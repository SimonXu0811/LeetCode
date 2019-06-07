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
    int sum = 0;
    public int sumNumbers(TreeNode root) {
        String s = "";
        GetPath(root, s);//找所有的路径
        return sum;
    }
    
    private void GetPath(TreeNode root, String s){
        if(root == null) return;//空树返回
        s += root.val;//保存路径上的值
        if(root.left == null && root.right == null){//遍历到叶子节点结束
            sum += Integer.valueOf(s);//转换成数字相加
            s = s.substring(0, s.length());//回溯
            return;
        }
        GetPath(root.left, s);
        GetPath(root.right, s);//找所有的路径
        s = s.substring(0, s.length());//回溯
    }
}

/*
时间复杂度:O(n^2)
空间复杂度:O(n)
*/
