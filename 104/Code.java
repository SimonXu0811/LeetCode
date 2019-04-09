public int maxDepth(TreeNode root) {
    if(root==null){//空树
        return 0;
    }
    return 1+Math.max(maxDepth(root.left),maxDepth(root.right));//取出哪个叶子结点还存在的 然后继续向下找
}

/*
时间复杂度:O(logn)
空间复杂度:O(1)
*/
