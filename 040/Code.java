class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        BackTrace(candidates, target, new ArrayList(), 0);//回溯
        return res;
    }
    
    public void BackTrace(int[] nums, int target, List<Integer> list, int n){
        if(target == 0){//回溯终点
            res.add(new ArrayList(list));
            return;
        }
        
        if(target < 0){//递归
            return; 
        }
        
        for(int i = n; i < nums.length; i++){
            if(i > n && nums[i] == nums[i - 1]) continue;//不能多次使用
            list.add(nums[i]);
            BackTrace(nums,target - nums[i],list, i + 1);//递归
            list.remove(list.size() - 1);//回溯
        }
    }
}

/*
时间复杂度:O(n)
空间复杂度:O(n)
*/
