class Solution {
    public int lengthOfLastWord(String s) {
    int len = s.length()-1;
    int ans = 0;
    boolean consume = true;
    while (len >= 0) {
        if (s.charAt(len) != ' ') {
            len--;
            ans++;
            if (consume)
                consume = false;
        }
        else if (consume)
            len--;
        else
            break;
    }
    
    return ans;
    
}
}

时间复杂度:O(n)
空间复杂度:O(1)
