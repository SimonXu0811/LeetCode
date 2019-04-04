class Solution {
    public boolean repeatedSubstringPattern(String s) {
        if(s == null || s.length() == 0) return true;//边界条件
        
        int n = s.length();
        for(int len = 1; len <= n/2; len++){ //这个子字符串长度最长只能是length/2
            if(n % len != 0) continue; //这个子字符串一定能将整个字符串等分
            
            String pattern = s.substring(0, len); //获取子字符串
            int i = len; //找到紧接着的第二个子字符串的区间
            int j = i + len - 1; //第二个子字符串的结尾
            while(j < n){//然后不能超过字符的长度
                String substr = s.substring(i, j + 1);
                if(!pattern.equals(substr)) break; 如果只要有一个不相等，那么直接跳出循环进行下一个字符串的判断
                i += len;
                j += len;
            }
            if(i == n) return true;//遍历完了就结束
        }
        return false;
    }
}

/*
时间复杂度:O(n^2)
空间复杂度:O(n)
*/
