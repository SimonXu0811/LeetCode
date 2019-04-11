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
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null)
            return t2;
        Stack < TreeNode[] > stack = new Stack <> ();//存为数组的形式匹配对
        stack.push(new TreeNode[] {t1, t2});
        while (!stack.isEmpty()) {
            TreeNode[] t = stack.pop();//根节点开始前序遍历
            if (t[0] == null || t[1] == null) {//都为空就一直向下迭代
                continue;
            }
            t[0].val += t[1].val;//两个元素值相加
            if (t[0].left == null) {//一边为空就直接复制
                t[0].left = t[1].left;
            } else {
                stack.push(new TreeNode[] {t[0].left, t[1].left});//继续左侧迭代
            }
            if (t[0].right == null) {//如果右侧没有，就复制过去
                t[0].right = t[1].right;
            } else {
                stack.push(new TreeNode[] {t[0].right, t[1].right});//右侧迭代
            }
        }
        return t1;
    }
}

/*
时间复杂度:O(n)
空间复杂度:O(n)
*/
