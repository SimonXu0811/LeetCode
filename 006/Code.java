class Solution {
    public String convert(String s, int numRows) {

        if (numRows == 1) return s;

        StringBuilder sb = new StringBuilder();
        int n = s.length();
        int len = 2 * numRows - 2;//索引每次加的len

        for (int i = 0; i < numRows; i++) {//逐行的添加
            for (int j = 0; j + i < n; j += len) {//每次添加len的区间
                sb.append(s.charAt(j + i));
                if (i != 0 && i != numRows - 1 && j + len - i < n)//对于中间的来说
                    sb.append(s.charAt(j + len - i));//添加进这一行的字符串
            }
        }
        return sb.toString();
    }
}

/*
时间复杂度:O(n)
空间复杂的:O(n)
*/
