class Solution {
    public int minPathSum(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(i == 0 && j == 0) continue;//不用考虑起始点
                if(i == 0) grid[i][j] += grid[i][j - 1];//最上层，每次加上左边的
                else if (j == 0) grid[i][j] += grid[i - 1][j];//最右层，每次加上上面的
                else grid[i][j] += Math.min(grid[i - 1][j] , grid[i][j - 1]);//找到上左小的那一个
            }
        }
        return grid[n - 1][m - 1];
    }
}

/*
时间复杂度:O(n)
空间复杂度:O(1)
*/
