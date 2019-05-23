class Solution {
    List<List<Integer>> res = new LinkedList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);//先整理 找出相同元素
        BackTrace(nums,0,new LinkedList<>());
        return res;
    }
    
    private void BackTrace(int[] nums, int n, List<Integer> list){
        if(res.contains(list)) return;//如果有了就不加
        res.add(new LinkedList(list));
        
        for(int i = n; i < nums.length; i++){//回溯将所有元素都加进去
            list.add(nums[i]);
            BackTrace(nums, i + 1, list);//加到底
            list.remove(list.size() - 1);//回溯
        }
    }
}

/*
时间复杂度:O(n)
空间复杂度:O(n)
*/
