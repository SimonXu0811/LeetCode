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
    List<Integer> list = new ArrayList<>();
    public List<Integer> preorder(Node root) {
        if(root == null){//空树不管
            return list;
        }
        list.add(root.val);//前序
        for(Node node : root.children){//遍历所有的子树
            preorder(node);
        }
        return list;//回溯
    }
}

/*
时间复杂度:O(n)
空间复杂度:O(n)
*/




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
    public List<Integer> preorder(Node root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) return list;//空树不管
        
        Stack<Node> stack = new Stack<>();
        stack.add(root);//先push进一个root，然后开始迭代
        
        while (!stack.empty()) {//一直到没有子树为止
            root = stack.pop();
            list.add(root.val);//前序根节点在最前
            for (int i = root.children.size() - 1; i >= 0; i--)//遍历所有的子树，由于是数组，所以要用for循环，先压进去，然后一个一个的迭代到最底下
                stack.add(root.children.get(i));
        }
        
        return list;
    }
}

/*
时间复杂度:O(n)
空间复杂度:O(n)
*/
