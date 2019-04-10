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
    public List < Integer > inorderTraversal(TreeNode root) {
        List < Integer > res = new ArrayList < > ();
        Stack < TreeNode > stack = new Stack < > ();
        TreeNode curr = root;
        while (curr != null || !stack.isEmpty()) {
            while (curr != null) {//从左一直遍历到最左侧的节点
                stack.push(curr);//把左侧节点放进栈中
                curr = curr.left;
            }
            curr = stack.pop();//然后pop掉最下面的
            res.add(curr.val);//加进栈中
            curr = curr.right;//开始找最右侧
        }
        return res;
    }
}

/*
时间复杂度:O(n)
空间复杂度:O(n)
*/
