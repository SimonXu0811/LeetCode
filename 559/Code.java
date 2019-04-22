/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Solution {
    public int maxDepth(Node root) {
        if (root == null) {
            return 0;
        }

        int max = 0;
        for (Node child : root.children) { //遍历所有子节点，有的话就加1
            int value = maxDepth(child);
            
            if (value > max) {//取最深的节点
                max = value;
            }
        }
        return max +1;//回溯
    }
}

/*
时间复杂度:O(n)
空间复杂度:O(n)
*/
