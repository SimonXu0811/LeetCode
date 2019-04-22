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
    public boolean isValidBST(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inorder(root, list);//保存树中的元素
        for(int i = 1; i < list.size(); i++){//查看是否递增
            if(list.get(i - 1) >= list.get(i)){
                return false;
            }
        }
        return true;
    }
    
    private List<Integer> inorder(TreeNode root, List<Integer> list){
        if(root == null){
            return list;
        }
        
        inorder(root.left,list);
        list.add(root.val);
        inorder(root.right,list);
            
        return list;
    }
}

/*
时间复杂度:O(n)
空间复杂度:O(n)
*/
