class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        if(numRows == 0){
            return res;
        }
        res.add(new ArrayList<>());
        res.get(0).add(1);
        //无论怎样，第一个答案一定都是{1}
        for(int i = 1; i < numRows; i++){
            List<Integer> temp = new ArrayList<>();
            List<Integer> pre = res.get(i-1);
            temp.add(1);//根据定义数组的第一个数都是1
            
            for(int j = 1; j < i; j++){
                temp.add(pre.get(j-1)+pre.get(j));//中间的数由上两个数相加得到
            }
            
            temp.add(1);//最后一个数也为1
            
            res.add(temp);
        }
        return res;
    }
}

/*
时间复杂度:O(n^2)
空间复杂度:O(1)
*/
