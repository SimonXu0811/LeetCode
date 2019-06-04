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
    public List<TreeNode> generateTrees(int n) {
        if(n == 0) return new LinkedList<TreeNode>();//如果是空，那么直接返回
        
        return BackTrace(1,n);//开始构造二叉树
    }
    
    private List<TreeNode> BackTrace(int start, int end){
        List<TreeNode> list = new LinkedList<>();//每一层用来保存构造完的二叉树
        
        if(start > end){//回溯的终点就是遍历结束了
            list.add(null);
            return list;
        }
        
        for(int i = start; i <= end; i++){//将每个都作为一个根节点
            List<TreeNode> left = BackTrace(start, i - 1);//遍历左侧的所有
            List<TreeNode> right = BackTrace(i + 1, end);//遍历右侧的所有
            
            for(TreeNode l : left){//遍历整个左侧
                for(TreeNode r : right){//遍历右侧
                    TreeNode root = new TreeNode(i);//构造出根节点
                    root.left = l;//左树
                    root.right = r;//右树
                    list.add(root);//构造完成保存进去
                }
            }
        }
        return list;
    }
}

/*
时间复杂度:O(n^3)
空间复杂度:O(n)
*/
