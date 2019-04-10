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
    public List<Integer> preorderTraversal(TreeNode root) {
        if(root == null){
            return list;
        }
        list.add(root.val);//前序就是先加根几点
        preorderTraversal(root.left);//然后左右
        preorderTraversal(root.right);
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
    public List<Integer> preorderTraversal(TreeNode node) {
	List<Integer> list = new LinkedList<Integer>();
	Stack<TreeNode> rights = new Stack<TreeNode>();
	while(node != null) {//如果还有其他的元素
		list.add(node.val);//先加根节点
		if (node.right != null) {//然后从右节点开始
			rights.push(node.right);
		}
		node = node.left;//然后再开始左节点
		if (node == null && !rights.isEmpty()) {//开始pop 左节点先出，右节点后出
			node = rights.pop();
		}
	}
    return list;
  }
}

/*
时间复杂度:O(n)
空间复杂度:O(n)
*/
