class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums.length; i++) {//如果出现过，那么把该索引上的值设为负
            int abs = Math.abs(nums[i]);
            if(nums[abs-1] < 0) {
                continue;
            } else {
                nums[abs-1] *= -1;
            }
        }
        for(int i = 0; i < nums.length; i++) {//最后索引上不为负的就是没出现过的值
            if(nums[i] > 0) {
                list.add(i+1);
            }
        }
        return list;
    }
}

/*
时间复杂的:O(n)
空间复杂的:O(1)
*/
