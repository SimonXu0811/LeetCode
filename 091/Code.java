public class Solution {
    public int numDecodings(String s) {
        int n = s.length();
        if (n == 0) return 0;//如果没有数
        
        int[] dp = new int[n+1];//多一个位置出来记录总和
        dp[n]  = 1;//从最后一位算起，如果是前面是0，那么就只能构成一位，如果不是，那么就赋1
        dp[n-1] = s.charAt(n-1) != '0' ? 1 : 0;
        
        for (int i = n - 2; i >= 0; i--)//每个都是记录之前的种类和，然后一直到第一个就是记录总和
            if (s.charAt(i) == '0') continue;
            else dp[i] = (Integer.parseInt(s.substring(i,i+2))<=26) ? dp[i+1]+dp[i+2] : dp[i+1];
        
        return dp[0];
    }
}

/*
时间复杂度:O(n)
空间复杂度:O(n)
*/
