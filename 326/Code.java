class Solution {
    public boolean isPowerOfThree(int n) {
        return (n > 0 && 1162261467 % n == 0);//不能为0，3的次方能被整除的只有3的次方
    }
}

/*
时间复杂度:O(1)
空间复杂度:O(1)
*/
