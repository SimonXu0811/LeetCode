class Solution {
    public int totalFruit(int[] tree) {
        if (tree.length < 1) {
            return tree.length;
        }
        int beg = 0;//第一个指针，用来标记第一个元素
        int end = 0;//这个指针用来标记第二个元素
        int max = 0;
        int prev = -1;//prev指针用来遍历
        HashSet hash = new HashSet();//保存水果的种类
        
        for (int i=0; i<tree.length; i++) {
            
            if (!hash.contains(tree[i])) {
                if (hash.size() >= 2) {//多余两种就删除
                    hash.remove(tree[prev-1]);
                    beg = prev;
                }
                hash.add(tree[i]);
            }
            if (i == 0 || tree[prev] != tree[i]) {
                prev = i;
            }
            end = i;
            max = (end - beg) > max ? end-beg : max;
        }
        return max + 1;
    }
}

/*
时间复杂度:O(n)
空间复杂度:O(n)
*/
