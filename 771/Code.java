class Solution {
    public int numJewelsInStones(String J, String S) {
        boolean[]  arr = new boolean[128];//用来保存所有的种类
        int count = 0;
        for(int i = 0;i<J.length();i++){//判断是否出现，如果出现过了，那么就为true
           arr[J.charAt(i)] = true;
        }
        for(int j = 0;j<S.length();j++){//判断是否存在，如果有，那么就次数加一
           if(arr[S.charAt(j)])
               count ++;
        }
        return count;
    }
}

/*
时间复杂度:O(n)
空间复杂度:O(1)
*/
