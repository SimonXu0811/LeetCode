class Solution1 {
    public List<Integer> getRow(int rowIndex) {
        
        if(rowIndex == 0){
            List<Integer> res = new ArrayList<>();
            res.add(1);
            return res;
        }//当索引为0时，返回的肯定就是数组{1}
        List<Integer> pre = new ArrayList<>(1);//创建数组来储存上一个的数组
        List<Integer> row = new ArrayList<>();//表示当前数组
        for(int i = 1; i <= rowIndex; i++){
            row.add(1);//头为1
            for(int j = 1; j < i; j++){
                row.add(pre.get(j)+pre.get(j-1));//中间的元素是上个元素的两个和
            }
            row.add(1);//尾为1
            pre = row;
            if(i!=rowIndex){
            row = new ArrayList<>();//如果没到index就重置
            }else{
                break;//否则结束
            }
        }
        return row;
    }
}

/*
时间复杂度:O(n^2)
空间复杂度:O(1)
*/



class Solution2 {
    public List<Integer> getRow(int rowIndex) {
        if (rowIndex == 0 ) return Arrays.asList(1);
        List<Integer> row = new ArrayList<>();
        long nCK = 1;
        // 二项式定理
        for (int i = 0; i <= rowIndex; i++) {
            row.add((int) nCK);
            nCK = nCK * (rowIndex - i) / (i + 1);
        }

        return row;
    }
}

/*
时间复杂度:O(n)
空间复杂度:O(1)
*/
