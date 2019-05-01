class Solution {
    public int climbStairs(int n) {
       if(n == 1) return 1;
        int[] dp = new int[n + 1];
        dp[1] = 1;//一层的话就是走1步
        dp[2] = 2;//两层就是走2步
        for(int i = 3; i < n + 1; i++){//然后后一个就是记录前面可以走的所有种类
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
}

/*
时间复杂度:O(n)
空间复杂度:O(n)
*/
