public class Solution {
    public String convertToTitle(int n) {
        StringBuilder result = new StringBuilder();//sb可用来更改字符串

        while(n>0){
            n--;
            result.insert(0, (char)('A' + n % 26));//26为一组查看
            n /= 26;
        }

        return result.toString();//返回字符串
    }
}

/*
时间复杂度:O(n)
空间复杂度:O(1)
*/
