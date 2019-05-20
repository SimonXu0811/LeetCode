class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int row = obstacleGrid.length;
        int col = obstacleGrid[0].length;
        if(obstacleGrid[0][0] == 1) return 0;
        obstacleGrid[0][0] = 1;
        
        for(int i = 0; i < row; i ++){
            for(int j = 0; j < col; j++){
                if(i == 0 && j == 0) continue;
                if(i == 0){//最上层的情况
                    if(obstacleGrid[i][j] == 1) obstacleGrid[i][j] = 0;//如果是1那么就全部不通
                    else obstacleGrid[i][j] += obstacleGrid[i][j - 1];//否则就是前一个能通过的步数
                }
                else if(j == 0){//最左侧的情况
                    if(obstacleGrid[i][j] == 1) obstacleGrid[i][j] = 0;//检验是不是1
                    else obstacleGrid[i][j] += obstacleGrid[i - 1][j];//复制过去
                }
                else{//中间的情况
                    if(obstacleGrid[i][j] == 1) obstacleGrid[i][j] = 0;//是1就不通
                    else obstacleGrid[i][j] = obstacleGrid[i - 1][j] + obstacleGrid[i][j - 1];//不是就是上面和左边的步数总和
                }
            }
        }
        return obstacleGrid[row - 1][col - 1];
    }
}

/*
时间复杂度:O(n)
空间复杂度:O(1)
*/
