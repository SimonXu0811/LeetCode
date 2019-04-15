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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new LinkedList<>();//用linkedlist插入会比arraylist快，查询慢
        Queue<TreeNode> queue = new LinkedList<>();
        if(root == null) {//空树
            return result;
        }
        queue.add(root);//先插入头节点
        while(!queue.isEmpty()) {
            int nodes = queue.size();
            List<Integer> levelNodes = new LinkedList<>();
            for(int i = 0; i < nodes; i++) {//每一层的节点遍历一遍
                TreeNode current = queue.poll();
                if(result.size() % 2 == 0) {//如果是偶数的话，那么就尾插
                    levelNodes.add(current.val);   
                }
                else {//奇数那就是头插
                    levelNodes.add(0, current.val);
                }
                                
                if(current.left != null) {//遍历下一层的节点
                    queue.add(current.left);
                }

                if(current.right != null) {
                    queue.add(current.right);
                }
            }
            result.add(levelNodes);//每一层的所有节点
        }
        return result;
     }
}

/*
时间复杂度:O(n)
空间复杂度:O(n)
*/
