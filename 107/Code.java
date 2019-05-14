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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();//利用先进先出的原则
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return res;
        
        queue.offer(root);//首先保存根节点
        while(!queue.isEmpty()){
            int n = queue.size();//记录每一层的长度
            List<Integer> list = new ArrayList<>();
            for(int i = 0; i < n; i++){//扫完每一层
                if(queue.peek().left != null){//先将下一层的保存进去
                    queue.offer(queue.peek().left);
                }
                if(queue.peek().right != null){
                    queue.offer(queue.peek().right);
                }
                list.add(queue.poll().val);//弹出上一层的所有节点
            }
            res.add(0,list);//每次加在最前面
        }
        
        return res;
    }
}

/*
时间复杂度:O(n)
空间复杂度:O(n)
*/
