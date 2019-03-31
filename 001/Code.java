class Solution1 {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int [2];
        for(int i = 0; i < nums.length; i++){//遍历一次数组，假设为一个目标，计算出另一个目标
            int temp = target - nums[i];
            for(int j = nums.length - 1; j > i; j--){//如果找到，那么就返回
                if(nums[j] == temp){
                    res[0] = i;
                    res[1] = j;
                    return res;
                }
            }
        }
        return res;
    }
}

/*
时间复杂度:O(n^2)
空间复杂度:O(1)
*/



class Solution2 {
  public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
        int complement = target - nums[i];//找到第二个目标值
        if (map.containsKey(complement)) {//如果找到就返回
            return new int[] { map.get(complement), i };
        }
        map.put(nums[i], i);//将数组值做为索引加进去
    }
    throw new IllegalArgumentException("No two sum solution");
  }
}

/*
时间复杂度:O(n)
空间复杂度:O(n)
*/
