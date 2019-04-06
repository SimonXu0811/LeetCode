public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int max = 0, i = 0, j = 0;
        while (i < n && j < n) {
            if (!set.contains(s.charAt(j))){//如果不存在相同的，那么就添加进去，然后取字符串的长度
                set.add(s.charAt(j++));
                max = Math.max(max, j - i);
            }
            else {//如果存在相同的了，那么就从起始点开始减，一直减掉那个相同的元素为止
                set.remove(s.charAt(i++));
            }
        }
        return max;
    }
}

/*
时间复杂度:O(n)
空间复杂度:O(n)
*/
