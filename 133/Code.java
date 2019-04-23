/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;

    public Node() {}

    public Node(int _val,List<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
};
*/
class Solution {
    public HashMap<Integer, Node> map = new HashMap<>();
    
    public Node cloneGraph(Node node) {
        return clone(node);
    }
    
    public Node clone(Node node) {
        if (node == null) return null;//如果node节点本身为null，直接返回null
        
        if (map.containsKey(node.val))//如果hashMap中已经存在了node.label对应的节点，直接返回该节点即可 
            return map.get(node.val);
        
        Node newNode = new Node(node.val, new ArrayList<Node>());//如果hashMap中还没有存在node.label对应的节点，新建一个节点
        map.put(newNode.val, newNode);
        for (Node neighbor : node.neighbors) //其label值为node.label，其neighbors的填充，需要遍历node.neighbors中的每一个节点
            newNode.neighbors.add(clone(neighbor));
        return newNode;
    }
}

/*
时间复杂度:O(n)
空间复杂度:O(n)
*/
