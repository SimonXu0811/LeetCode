class Solution {
    public int countSegments(String s) {
        int count = 0;//计算字符片段的次数
        for(int i = 0; i < s.length(); i++){//遍历字符串
            if((i == 0 || s.charAt(i - 1) == ' ') && s.charAt(i) != ' '){//前一个为空格，后一个不为空格
                count ++;
            }
        }
        return count;
    }
}

/*
时间复杂度:O(n)
空间复杂度:O(1)
*/
