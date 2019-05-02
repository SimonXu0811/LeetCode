class Solution {
    public int[] countBits(int num) {
        int[] res = new int[num + 1];
        for(int i = 0; i <= num; i++){
            res[i] = Integer.bitCount(i);//内置函数转换
        }
        
        return res;
    }
}

/*
时间复杂度:O(n*m)
空间复杂度:O(n)
*/
