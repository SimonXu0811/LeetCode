class Solution {
    public boolean backspaceCompare(String S, String T) {
        int i = S.length() - 1, j = T.length() - 1;
        int skipS = 0, skipT = 0;

        while (i >= 0 || j >= 0) { //字符串中还存在字符
            while (i >= 0) { 
                if (S.charAt(i) == '#') {skipS++; i--;}//如果含有#，那就向前遍历，把需要跳过的次数加一
                else if (skipS > 0) {skipS--; i--;}//如果便利到了下一个非#，就开始跳过
                else break;
            }
            while (j >= 0) { //对T同样操作
                if (T.charAt(j) == '#') {skipT++; j--;}
                else if (skipT > 0) {skipT--; j--;}
                else break;
            }

            if (i >= 0 && j >= 0 && S.charAt(i) != T.charAt(j))//如果有一个不等，那就是不相等的
                return false;

            if ((i >= 0) != (j >= 0))//如果有个先结束了，那么就是不等的
                return false;
            i--; j--;
        }
        return true;
    }
}

/*
时间复杂度:O(n)
空间复杂度:O(1)
*/
