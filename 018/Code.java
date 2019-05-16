class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){
            int t = target - nums[i];//转换成三数之和
            for(int j = i + 1; j < nums.length; j++){
                int temp = t - nums[j];//转换成两数之和
                int k = j + 1;//用双指针扫瞄一遍数组
                int l = nums.length - 1;
                while(k < l){//双指针法
                    if(nums[k] + nums[l] == temp){//如果符合要求，那么就加进数组
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[k]);
                        list.add(nums[l]);
                        if(res.contains(list)){//如果存在了，那么就回溯到上一层
                            list.remove(list.size() - 1);
                            list.remove(list.size() - 1);
                        }else{//没有就添加进去
                            res.add(list);
                        }
                    }
                    if(nums[k] + nums[l] > temp){//如果大了，右边的移动
                        l--;
                    }else{//小了左边的移动
                        k++;
                    }
                }
            }
        }
        return res;
    }
}

/*
时间复杂度分析:O(n^3)
空间复杂度分析:O(1)
*/
