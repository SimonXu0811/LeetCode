class Solution {
    int sum,carry;
    public int getSum(int a, int b) {
        if(b == 0){
            return sum;
        }
        sum = a ^ b;//用异或来表示加法，因为0^1=1，相当于加
        carry = (a & b) << 1;//因为只有1&1=1，所以进位carry要向前移一个
        return getSum(sum, carry);
    }
}

/*
时间复杂度:O(1)
空间复杂度:O(1)
*/
