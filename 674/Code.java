class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int ans = 0, index = 0;
        for (int i = 0; i < nums.length; i++) {//从头向后遍历数组
            if (i > 0 && nums[i-1] >= nums[i]) index = i;//记录递减数的索引
            ans = Math.max(ans, i - index + 1);//取最大值
        }
        return ans;
    }
}

/*
时间复杂度:O(n)
空间复杂度:O(1)
*/
