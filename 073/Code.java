public class Solution {
public void setZeroes(int[][] matrix) {
    boolean fr = false,fc = false;
    for(int i = 0; i < matrix.length; i++) {
        for(int j = 0; j < matrix[0].length; j++) {
            if(matrix[i][j] == 0) {
                if(i == 0) fr = true;//如果最上侧有0，那么就记录
                if(j == 0) fc = true;//如果最左侧有0，就记录
                matrix[0][j] = 0;//遇到有值为0，那么左侧和上侧都归为0
                matrix[i][0] = 0;
            }
        }
    }
    for(int i = 1; i < matrix.length; i++) {
        for(int j = 1; j < matrix[0].length; j++) {
            if(matrix[i][0] == 0 || matrix[0][j] == 0) {//如果遇到有值的边界为0，那么就将这个值为0
                matrix[i][j] = 0;
            }
        }
    }
    if(fr) {//如果记录过了，就这一行归位0
        for(int j = 0; j < matrix[0].length; j++) {
            matrix[0][j] = 0;
        }
    }
    if(fc) {
        for(int i = 0; i < matrix.length; i++) {
            matrix[i][0] = 0;
        }
    }
    
}

/*
时间复杂度:O(n)
空间复杂度:O(1)
*/
