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
class Solution{
public Node connect(Node cur) {
    Node root = cur;//临时变量遍历树
    Node dummyHead = new Node(0);//保存首结点
    Node pre = dummyHead;
    while (root != null) {//遍历整棵树
	    if (root.left != null) {
		    pre.next = root.left;//指向左节点
		    pre = pre.next;//然后链表到该左节点
	    }
	    if (root.right != null) {
		    pre.next = root.right;//接着指向该结点的右节点
		    pre = pre.next;//然后移动
	    }
	    root = root.next;
	    if (root == null) {//如果是最后一个右节点
		    pre = dummyHead;
		    root = dummyHead.next;
		    dummyHead.next = null;//保存null值
	    }
    }
    return cur;
}
}

/*
时间复杂度:O(n)
空间复杂度:O(1)
*/
