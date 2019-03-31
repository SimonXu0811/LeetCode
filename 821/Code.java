class Solution {
    public int[] shortestToChar(String S, char C) {
        int[] res = new int [S.length()];
        int pre = Integer.MIN_VALUE / 2;
        for(int i = 0; i < S.length(); i++){//先从前向后遍历，计算出每一位与前一位目标的索引差值
            if(S.charAt(i) ==C){
                pre = i;
            }
            res[i] = i - pre;
        }
        pre = Integer.MAX_VALUE / 2;
        for (int i = S.length()-1; i >= 0; i--){//再从后向前遍历，找出每一位与后一个目标的索引差值，取最小
            if(S.charAt(i) == C){
                pre = i;
            }
            res[i] = Math.min(pre - i, res[i]);
        }
        return res;
    }
}

/*
时间复杂度:O(n)
空间复杂度:O(n)
*/

