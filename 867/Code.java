class Solution1 {
    public int[][] transpose(int[][] A) {
        int row = A.length;//原来的行
        int col = A[0].length;//原来的列
        int[][] res= new int[col][row];//矩阵转制
        for(int i = 0; i < col; i++){
            for(int j = 0; j < row; j++){//让行等与列，列等于行
                res[i][j] = A[j][i];
            }    
        }
        return res;
    }
}

/*
时间复杂度:O(R*C)
空间复杂度:O(R*C)
*/



