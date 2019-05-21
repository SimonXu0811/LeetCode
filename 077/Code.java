class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        backTrace(n,k,new ArrayList<>(),1);//回溯
        return res;
    }
    
    private void backTrace(int n, int k, List<Integer> list, int temp){
        if(list.size() == k){//终点就是长度满足了
            res.add(new ArrayList(list));
        }
        for(int i = temp; i < n + 1; i++){
            list.add(i);//添加一个数
            backTrace(n, k, list, i + 1);//从这个数开始继续向后添加
            list.remove(list.size() - 1);//到顶了就回溯
        }
    }
}

/*
时间复杂度:O(n)
空间复杂度:O(n)
*/
