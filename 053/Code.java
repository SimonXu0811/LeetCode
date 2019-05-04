class Solution {
    public int maxSubArray(int[] nums) {
        int[] dp = new int[nums.length];//动态规划
        dp[0] = nums[0];
        int max = dp[0];
        
        for(int i = 1; i < nums.length; i++){
            dp[i] = Math.max(nums[i],  nums[i] + dp[i - 1]);//状态转移方程
            max = Math.max(dp[i], max);//找到最大的和值
        }
        return max;
    }
}

/*
时间复杂度:O(n)
空间复杂度:O(n)
*/
