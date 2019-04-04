public class Solution {
    public int findLUSlength(String a, String b) {
        if (a.equals(b))//相等就肯定没有
            return -1;
        return Math.max(a.length(), b.length());//不相等，那么最长的那个肯定不是公共子字符串
    }
}

/*
时间复杂度:O(n)
空间复杂度:O(1)
*/
