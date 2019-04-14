/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val,Node _left,Node _right,Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/
class Solution {
    public Node connect(Node root) {
        Node level = root;//从根节点开始
        while(level != null){//一直遍历到左下就可以了
            Node cur = level;
            while(cur != null){//如果不是叶子结点
                if(cur.left != null) cur.left.next = cur.right;//那么左子节点指向右子节点
                if(cur.right != null && cur.next != null) cur.right.next = cur.next.left;//然后右子节点指向付节点的右节点
                
                cur  = cur.next;//继续到底
            }
            level = level.left;//遍历到左下
        }
        return root;
    }
}

/*
时间复杂度:O(n)
空间复杂度:O(n)
*/
