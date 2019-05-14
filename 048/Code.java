public class Solution {
    public void rotate(int[][] matrix) {
        for(int i = 0; i<matrix.length; i++){//先行列交换
            for(int j = i; j<matrix[0].length; j++){
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int i =0 ; i<matrix.length; i++){//然后每一行首尾交换
            for(int j = 0; j<matrix.length/2; j++){
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][matrix.length-1-j];
                matrix[i][matrix.length-1-j] = temp;
            }
        }
    }
}

/*
时间复杂度:O(n)
空间复杂度:O(1)
*/
