class Solution {
    public int minFlipsMonoIncr(String S) {
        int leftOnes = 0, rightOnes = 0, rightZeros = 0;
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '0') rightZeros++;
            else rightOnes++;
            if (rightZeros > rightOnes) {  // 右侧的0超过1，那么移动至分割点，减小翻转次数
                leftOnes += rightOnes;
                rightOnes = rightZeros = 0;
            }
        }
        return leftOnes + rightZeros;
    }
}

/*
时间复杂度:O(n)
空间复杂度:O(1)
*/
