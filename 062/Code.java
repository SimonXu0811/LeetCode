class Solution {
    public int uniquePaths(int m, int n) {
            int N = n + m - 2;//总步数
            int k = m - 1; //向下的步数
            double res = 1;
            for (int i = 1; i <= k; i++)
                res = res * (N - k + i) / i;//阶乘
            return (int)res;
    }
}

/*
时间复杂度:O(n)
空间复杂度:O(n)
*/
