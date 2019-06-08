class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int[] A = new int[triangle.size() + 1];//用来记录每一层的最小值
        
        for (int i = triangle.size() - 1; i >= 0; i--){//从最后一层开始
            for(int j = 0; j < triangle.get(i).size(); j++){//比较相邻的值
                A[j] = Math.min(A[j], A[j + 1]) + triangle.get(i).get(j);//找到相邻值的最小和
            }
        }
        return A[0];
    }
}

/*
时间复杂度:O(i*j)
空间复杂度:O(i)
*/
