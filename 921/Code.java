class Solution {
    public int minAddToMakeValid(String S) {
        int count = 0, res = 0;//count记录无效的闭合括号，res记录无效的开括号
        for (int i = 0; i < S.length(); ++i) {
            res += S.charAt(i) == '(' ? 1 : -1;//如果是开括号就是1，闭合括号就是-1
            if (res == -1) {//如果是无效的闭合括号的话，count+1，然后res归0
                count++;
                res++;
            }
        }

        return count + res;//最后两种括号出现的次数相加
    }
}

/*
时间复杂度:O(n)
空间复杂度:O(1)
*/
