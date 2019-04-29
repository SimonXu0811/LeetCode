class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> list = new ArrayList<>();
        backtrace(candidates,target,list,0,0);
        return res;
    }
    
    private void backtrace(int[] nums, int t, List<Integer> list, int sum, int j){
        if(sum == t){//结束的条件就是等于了目标值
            res.add(new ArrayList<>(list));
        }
        if(sum > t) return; //如果太大了，那么就返回上一层
            
        for(int i = j; i < nums.length; i++){
            sum += nums[i];//加这个数判断
            list.add(nums[i]);//添加进数组
            backtrace(nums,t,list,sum,i);//下一次的递归还是从这个数本身开始，因为包含了自身
            sum -= nums[i];//删除刚刚的数
            list.remove(list.size() - 1);//删除，开始添加后面的
        }//循环结束之后开始回溯
    }
}

/*
时间复杂度:O(n^n)
空间复杂度:O(n)
*/
