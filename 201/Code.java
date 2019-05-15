class Solution {
    public int rangeBitwiseAnd(int m, int n) {
        int cnt = 0;
        while(m!=n) {
        	if(m==0)
        		return 0;
        	m >>= 1;//不断的右移直到相等找公共前缀
        	n >>= 1;
        	cnt++;
        }
        return m<<cnt;//恢复即可
    }
}

/*
时间复杂度:O(n)
空间复杂度:O(1)
*/
