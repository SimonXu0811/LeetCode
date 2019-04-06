class Solution {
    public int myAtoi(String str) {
    int index = 0, sign = 1, total = 0;
    str = str.trim();//去掉首尾的空格

    if(str.length() == 0) return 0;//临界判断

    if(str.charAt(index) == '+' || str.charAt(index) == '-'){//判断正负号，记为sign
        sign = str.charAt(index) == '+' ? 1 : -1;
        index ++;
    }
    
    while(index < str.length()){//向后遍历数组，直到字母结束
        int digit = str.charAt(index) - '0';
        if(digit < 0 || digit > 9) break;

        if(Integer.MAX_VALUE/10 < total || Integer.MAX_VALUE/10 == total && Integer.MAX_VALUE %10 < digit)//如果数字快达到临界了，但是还有数字能遍历出来，那么说明这个就是超出Integer的范围了
            return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;

        total = 10 * total + digit;
        index ++;
    }
    return total * sign;//最后乘上符号
}
}

/*
时间复杂度:O(n)
空间复杂度:O(1)
*/
