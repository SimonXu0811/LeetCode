class Solution {
    public boolean isPalindrome(String s) {
        int l = 0, r = s.length() - 1;//左右双指针
        while(l < r){
            if(!Character.isLetterOrDigit(s.charAt(l))){//如果不合法，那么向右移动
                l++;
                continue;
            }else if(!Character.isLetterOrDigit(s.charAt(r))){//如果不合法，那么向左移动
                r--;
                continue;
            }
            if(Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))){//如果不等，那么久返回false
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}

/*
时间复杂度:O(n)
空间复杂度:O(1)
*/
