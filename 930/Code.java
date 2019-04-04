class Solution {
    public int numSubarraysWithSum(int[] A, int S) {
        int iL = 0, iH = 0;
        int sumL = 0, sumH = 0;
        int ans = 0;

        for (int j = 0; j < A.length; ++j) {//如果sum太大了，那么就移动low
            sumL += A[j];
            while (iL < j && sumL > S)
                sumL -= A[iL++];

            sumH += A[j];
            while (iH < j && (sumH > S || sumH == S && A[iH] == 0))//如果sum太大了，或者等于5或者等于0，那么就移动high
                sumH -= A[iH++];

            if (sumL == S)//最后找到两个索引的距离差
                ans += iH - iL + 1;
        }

        return ans;
    }
}

/*
时间复杂度:O(n)
空间复杂度:O(1)
*/
