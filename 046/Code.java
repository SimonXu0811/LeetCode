class Solution {
    List<List<Integer>> res = new ArrayList<>();//最终的数组
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> list = new ArrayList<>();//临时保存数组
        backtrace(list, nums);//回溯
        return res;
    }
    
    private void backtrace(List<Integer> list, int[] nums){
        if(list.size() == nums.length){//如果长度相同了就加进最终的数组
            res.add(new ArrayList(list));
        }
        
        for(int i = 0; i < nums.length; i++){
            if(list.contains(nums[i])) continue;//因为从0开始，所以如果存在了那么就向后移动
            list.add(nums[i]);//添加新的数
            backtrace(list, nums);//向后移动，找未添加过的数
            list.remove(list.size() - 1);//然后删除新添加的，查找其他剩下的
        }//循环结束返回继续回溯
    }
}

/*
时间复杂度:O(n!)
空间复杂度:O(n)
*/
