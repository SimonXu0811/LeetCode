class Solution {
    public boolean isPalindromeRange(String s, int i, int j) {
        for (int k = i; k <= i + (j - i) / 2; k++) {//继续遍历，查看是否相同
            if (s.charAt(k) != s.charAt(j - k + i)) return false;
        }
        return true;
    }
    public boolean validPalindrome(String s) {
        for (int i = 0; i < s.length() / 2; i++) {//遍历一遍就行，因为如果是回文字符串，后一半一定和前一半相同
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {//如果头尾两个不相同，那么删除一个头或一个尾，判断删除后是否相同
                int j = s.length() - 1 - i;
                return (isPalindromeRange(s, i+1, j) ||
                        isPalindromeRange(s, i, j-1));//判断删除后头尾的是否相同
            }
        }
        return true;
    }
}

/*
时间复杂度:O(n)
空间复杂度:O(1)
*/
