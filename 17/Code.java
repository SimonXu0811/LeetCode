/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class BSTIterator {
    
    Stack<TreeNode> stack =  null ;            
    TreeNode current = null ;
    	
    public BSTIterator(TreeNode root) {
        current = root;	     
        stack = new Stack<> ();//先初始化
    }
    
    public boolean hasNext() {//如果stack中还有元素或者说没有遍历到最后的叶子节点
    	return !stack.isEmpty() || current != null;  
    }
    
    public int next() {//用来中序遍历
    	while (current != null) {//首先加左节点进去
    		stack.push(current);
    		current = current.left ;
    }		
    	TreeNode t = stack.pop() ;//然后回溯到上一个节点
    	current = t.right ;//添加到右节点
    	return t.val ;//返回子节点的值
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */
 
 /*
 时间复杂度:next为:O(h) hasNext为:O(1)
 空间复杂度:O(n)
 */
