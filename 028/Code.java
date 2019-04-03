class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length()>haystack.length())
            return -1;
        if(needle == null)
            return 0;
        
        for(int i = 0; i <= haystack.length() - needle.length(); i++){//从头开始遍历
            if(haystack.substring(i , i + needle.length()).equals(needle)){//查询substring是否相等
                return i;
            }
        }
        return -1;
    }
}
