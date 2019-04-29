class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        boolean[] check = new boolean[nums.length];//用来检查是否已经遍历过了
        backtrace(list,nums,check);
        return res;
    }
    
    private void backtrace(List<Integer> list, int[] nums, boolean[] check){
        if(list.size() == nums.length){//如果数组相等，那么就是结束的条件，加进数组
            res.add(new ArrayList<>(list));
        }
        
        for(int i = 0; i < nums.length; i++){
            if(i > 0 && nums[i] == nums[i - 1] && !check[i - 1]|| check[i]) continue;//如果被便利过，或者后面有值相同，那么就继续
            list.add(nums[i]);//添加新的数
            check[i] = true;//记为访问过
            backtrace(list,nums,check);//添加新的数
            check[i] = false;//开始删除新的数并且记做未访问，然后继续添加
            list.remove(list.size() - 1);
        }//循环结束返回上一层
    }
}

/*
时间复杂度:O(n!)
空间复杂度:O(n)
*/
