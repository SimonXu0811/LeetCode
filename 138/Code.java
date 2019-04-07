/*
// Definition for a Node.
class Node {
    public int val;
    public Node next;
    public Node random;

    public Node() {}

    public Node(int _val,Node _next,Node _random) {
        val = _val;
        next = _next;
        random = _random;
    }
};
*/
class Solution {
   public Node copyRandomList(Node head) {
    if (head == null) return null;
    Node cur = head;
    Map<Node, Node> map = new HashMap<>();//用map保存，节点的值作为key，性质作为value
    while (cur != null) {//遍历整个数组
        map.put(cur, new Node(cur.val, null, null));//把节点的性质保存进去
        cur = cur.next;
    }
    map.forEach((k, v) -> {//遍历整个map由于map自带的就是链表或者红黑树保存，所以将所有的性质保存进一起
        v.next = map.get(k.next);
        v.random = map.get(k.random);
    });
    return map.get(head);//输出每个性质
}
}

/*
时间复杂度:O(n)
空间复杂度:O(n)
*/
