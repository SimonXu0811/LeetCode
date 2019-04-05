class Solution {
    public String longestPalindrome(String s) {
    if (s == null || s.length() < 1) return "";
    int start = 0, end = 0;//substring的起始点
    for (int i = 0; i < s.length(); i++) {//做为中间的字符向两边扩展
        int len1 = expandAroundCenter(s, i, i);，从本身出发
        int len2 = expandAroundCenter(s, i, i + 1);，从两个出发
        int len = Math.max(len1, len2);//取出最长的字符串
        if (len > end - start) {
            start = i - (len - 1) / 2;//计算起始点
            end = i + len / 2;//计算终点
        }
    }
    return s.substring(start, end + 1);
}

private int expandAroundCenter(String s, int left, int right) {
    int L = left, R = right;//记录两个指针
    while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {//如果相等，那么向外扩展
        L--;
        R++;
    }
    return R - L - 1;
}
}

/*
时间复杂度:O(n^2)
空间复杂度:O(1)
*/
