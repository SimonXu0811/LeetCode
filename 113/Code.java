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
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        BackTrace(root, sum, new ArrayList<>());//回溯法
        return res;
    }
    
    private void BackTrace(TreeNode root, int sum, List<Integer> list){
        if(root == null) return;//到了根节点就回溯
        list.add(root.val);//前序遍历
        if(sum == root.val && root.left == null && root.right == null){//到了最后一个叶子节点，并且值满足条件，就加进数组
            res.add(new ArrayList(list));
            list.remove(list.size() - 1);//回溯
            return;
        }
        BackTrace(root.left, sum - root.val, list);//前序遍历找目标值
        BackTrace(root.right, sum - root.val ,list);
        list.remove(list.size() - 1);//回溯
            
    }
}

/*
时间复杂度:O(n)
空间复杂度:O(n)
*/
