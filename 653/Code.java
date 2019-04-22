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
    public boolean findTarget(TreeNode root, int k) {
        List < Integer > list = new ArrayList();
        inorder(root, list);//首先将树中的元素保存到list中
        int l = 0, r = list.size() - 1;
        while (l < r) {//双指针
            int sum = list.get(l) + list.get(r);
            if (sum == k)
                return true;
            if (sum < k)//两边之和太小了，那么左边的移动
                l++;
            else//太大了，那么右边的移动
                r--;
        }
        return false;
    }
    public void inorder(TreeNode root, List < Integer > list) {
        if (root == null)
            return;
        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
    }
}

/*
时间复杂度:O(n)
空间复杂度:O(n)
*/
