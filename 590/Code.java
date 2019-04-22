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
    public List<Integer> postorder(Node root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) return list;
        
        Stack<Node> stack = new Stack<>();
        stack.add(root);
        
        while(!stack.isEmpty()) {//模拟前序
            root = stack.pop();
            list.add(root.val);
            for(Node node: root.children)//顺序push进stack，那么pop的时候就是逆序的加进数组
                stack.add(node);
        }
        Collections.reverse(list);//翻转
        return list;
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
    List<Integer> list = new ArrayList<>();
    public List<Integer> postorder(Node root) {
        if(root == null){//空树
            return list;
        }
        
        for(Node node : root.children){//先遍历所有的子树
            postorder(node);
        }
        
        list.add(root.val);//然后加上父节点
        return list;
    }
}

/*
时间复杂度:O(n)
空间复杂度:O(n)
*/
