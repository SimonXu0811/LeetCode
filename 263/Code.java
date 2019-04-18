class Solution {
    public boolean isUgly(int num) {
        for (int i=2; i<6 && num>0; i++)//与2345相除
            while (num % i == 0)//如果可以除尽，那么就除
               num /= i;
        return num == 1;//返回最后除完的数
    }
}

/*
时间复杂度分析:O(k)
空间复杂度分析:O(1)
*/
