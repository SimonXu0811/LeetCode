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
    public String tree2str(TreeNode t) {
        if (t == null)//空树就返回空
            return "";
        Stack <TreeNode> stack = new Stack <> ();
        stack.push(t);//把根节点保存起来
        Set <TreeNode> visited = new HashSet <> ();
        StringBuilder s = new StringBuilder();
        while (!stack.isEmpty()) {
            t = stack.peek();
            if (visited.contains(t)) {//从叶子节点回溯到根节点
                stack.pop();
                s.append(")");//把后面的闭合括号封上
            } else {//从上向下遍历
                visited.add(t);
                s.append("(" + t.val);//开括号加上树的值
                if (t.left == null && t.right != null)//如果只有右子树的话，那么也要保留左树的空值
                    s.append("()");
                if (t.right != null)//继续向下遍历
                    stack.push(t.right);
                if (t.left != null)
                    stack.push(t.left);
            }
        }
        return s.substring(1, s.length() - 1);//删除根节点前面的一个括号
    }
}

/*
时间复杂度:O(n)
空间复杂度:O(n)
*/
