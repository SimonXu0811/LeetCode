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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<Integer>();
        rightView(root, result, 0);//回溯
        return result;
    }
    
    public void rightView(TreeNode curr, List<Integer> result, int currDepth){
        if(curr == null){//回溯的终点，开始返回
            return;
        }
        if(currDepth == result.size()){//记录最后一个即可
            result.add(curr.val);
        }
        
        rightView(curr.right, result, currDepth + 1);//BFS
        rightView(curr.left, result, currDepth + 1);
        
    }
}

/*
时间复杂度:O(n)
空间复杂度:O(n)
*/
