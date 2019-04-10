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
    public List<Integer> postorderTraversal(TreeNode root) {
    LinkedList<Integer> result = new LinkedList<>();
    Deque<TreeNode> stack = new ArrayDeque<>();
    TreeNode p = root;
    while(!stack.isEmpty() || p != null) {
        if(p != null) {
            stack.push(p);
            result.addFirst(p.val); //先保存中间的
            p = p.right;//然后保存右边的
        } else {
            TreeNode node = stack.pop();
            p = node.left;//保存左边的，先进先出
        }
    }
    return result;
}
}

/*
时间复杂度:O(n)
空间复杂度:O(n)
*/
