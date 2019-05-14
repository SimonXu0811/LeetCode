class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) return false;//负数肯定不是
        int res = 0;
        int n = x;
        while(n != 0){//翻转数
            res = res * 10 + n % 10;
            n /= 10;
        }
        
        return res == x;//判断是否相等
    }
}

/*
时间复杂度:O(logn)
空间复杂度:O(1)
*/
