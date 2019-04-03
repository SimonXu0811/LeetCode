class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) return "";
        String s = strs[0];//将第一个元素作为公共字符串
        for(String S : strs){//遍历数组，判断最长公共字符串
            while(S.indexOf(s) != 0){//一直删到有相同的前缀
                s = s.substring(0,s.length()-1);//没有就删一个
                if(s.isEmpty()){//删空就停止
                    return "";
                }
            }
        }
        return s;
    }
}

/*
时间复杂度:O(n)
空间复杂度:O(1)
*/
