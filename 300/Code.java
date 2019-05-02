class Solution {
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        int dp[]=new int[n];
        int res=0;
        for(int i=0;i<n;i++){
            dp[i]=1;
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j]){ // 看以前的，比它小的，说明可以接在后面形成一个更长的子序列
                    dp[i]=Math.max(dp[i],dp[j]+1);
                }
            }
            res=Math.max(res,dp[i]);找到最长的
        }
        return res;
    }
}

/*
时间复杂度:O(n^2)
空间复杂度:O(n)
*/
