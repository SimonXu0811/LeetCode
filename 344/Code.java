class Solution {
    public void reverseString(char[] s) {
        int i = 0; //头指针
        int j = s.length - 1;//尾指针
        while(i < j){//交换
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
    }
}

/*
时间复杂度:O(n)
空间复杂度:O(n)
*/
