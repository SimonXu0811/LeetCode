class Solution {
    public int lengthOfLastWord(String s) {
    int len = s.length()-1;
    int ans = 0;
    boolean consume = true;//判断是否是末尾的
    while (len >= 0) {
        if (s.charAt(len) != ' ') {//不是空格就向前，长度加一
            len--;
            ans++;
            if (consume)
                consume = false;//这时后面遇到的空格就不是末尾空格了
        }
        else if (consume)//如果是末尾空格的话，就继续向前
            len--;
        else
            break;
    }
    
    return ans;
}
}

时间复杂度:O(n)
空间复杂度:O(1)
