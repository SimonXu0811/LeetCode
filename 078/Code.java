class Solution {
    List<List<Integer>> res = new ArrayList<>();//保存最终的答案
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> list = new ArrayList<>();//临时保存数组
        backtrace(nums, 0, list);//回溯
        return res;
    }
    
    private void backtrace(int[] nums, int n, List<Integer> list){
        res.add(new ArrayList<Integer>(list));//加临时的数组进答案
        
        for(int i = n; i < nums.length; i++){
            list.add(nums[i]);//添加第i个进临时数组
            backtrace(nums, i + 1, list);//将临时数组加入答案中，并添加下一个数
            list.remove(list.size() - 1);//把最新的数删掉继续循环
        }//循环结束返回上一层继续回溯
    }
    
}

/*
时间复杂度:O(2^n)
空间复杂度:O(n)
*/
