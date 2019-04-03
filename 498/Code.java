class Solution {
    public int[] findDiagonalOrder(int[][] matrix) {
        if (matrix.length==0)return new int[0];
        int n = matrix[0].length;
        int m = matrix.length;
        int [] res = new int[m * n];//新建数组保存
        int k=0;
        boolean down = false;//默认为false，一奇一偶交替
        for (int i=0,j=0; i<n && j<m;){//遍历整个矩阵
            res[k]=matrix[j][i];
            k++;
            if (down){
                if (j==m-1){i++;down = false;}//到了最底下，就向右走
                else if (i==0){j++;down = false;}//否则向下走
                else {//中间部分是从右上到左下
                    j++; i--;
                }
            } else {
                if (j==0 && i<n-1){i++;down = true;}//最上层就向右走
                else if (i==n-1){j++;down = true;}//到了最右就向下走
                else {//中间部分从左下到右上
                    j--; i++;
                }    
            }
        }
        return res;
    }
}

/*
时间复杂度:O(n)
空间复杂度:O(n)
*/
