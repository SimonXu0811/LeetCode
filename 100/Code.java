class Solution {
  public boolean isSameTree(TreeNode p, TreeNode q) {
    if (p == null && q == null) return true;//都为空树的话那么返回true
    if (q == null || p == null) return false;//如果一个为空树一个不是，那么返回false
    if (p.val != q.val) return false;//如果两个不等，那么就返回false
    return isSameTree(p.right, q.right) &&isSameTree(p.left, q.left);//递归
  }
}

/*
时间复杂度:O(n)
空间复杂度:O(1)
*/
