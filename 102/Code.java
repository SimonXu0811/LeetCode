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
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {//空树
            return new ArrayList<>();
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);//先加入根节点
        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> arrays = new ArrayList<>();
        TreeNode temp = null;
        while (!queue.isEmpty()) {
            int n = queue.size();// 这里通过读取队列的元素，获取这一层有多少个元素
            for (int i = 0; i < n; i++) {
                temp = queue.poll();//把上一层的节点poll出来，获取子节点
                arrays.add(temp.val);
                if (temp.left != null) {
                    queue.add(temp.left);
                }
                if (temp.right != null) {
                    queue.add(temp.right);
                }
            }
            lists.add(new ArrayList<>(arrays));// 将每一层的数据放入到链表中
            arrays.clear();
        }
        return lists;
    }
}

/*
时间复杂度:O(n)
空间复杂度:O(n)
*/
