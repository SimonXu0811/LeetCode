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
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root == null) return res;//空树
        
        Queue<Node> que = new LinkedList<>();
        que.offer(root);
        
        while(!que.isEmpty()){//开始遍历到所有元素用完
            int size = que.size();//保存上一个父节点的元素个数
            List<Integer> list = new ArrayList<>();
            
            for(int i = 0; i < size; i++){//父节点poll干净，然后加所有父节点的所有子节点
                root = que.poll();
                list.add(root.val);//边poll边加进数组
                for(Node node : root.children){
                    que.offer(node);
                }
            }
            
            res.add(list);
        }
        return res;
    }
}

/*
时间复杂度:O(n)
空间复杂度:O(n)
*/
