public class Solution {
    public int pathSum(TreeNode root, int sum) {
        if (root == null) return 0;
        return pathSumIndex(root, sum) //根节点为一个值，两边开始向下迭代找是否有满足的
               + pathSum(root.left, sum) //左子树开始找路径
               + pathSum(root.right, sum);//右子树开始找路径
    }
    
    private int pathSumIndex(TreeNode node, int sum) {
        if (node == null) return 0;
        return (node.val == sum ? 1 : 0) //如果找到了，那么就+1
            + pathSumIndex(node.left, sum - node.val) //从节点开始深度遍历找路径
            + pathSumIndex(node.right, sum - node.val);
    }
}

/*
时间复杂度:O(n^2)
空间复杂度:O(1)
*/
