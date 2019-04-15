class Solution {
    int count = 0;
    public boolean isHappy(int n) {
        return getsum(n);
    }
    
    private boolean getsum(int n){
        int res = 0;
        count ++;
        while(n != 0){//把数字分解并且平方相加
            res += Math.pow(n%10,2);
            n /= 10;
        }
        if(count > 100){//结束的标志
            return false;
        }
        return res == 1? true:getsum(res);//如果是1就返回，不是就继续递归
    }
}

/*
时间复杂度:O(1)
空间复杂度:O(1)
*/
