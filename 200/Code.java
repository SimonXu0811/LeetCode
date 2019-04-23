class Solution {
    public int numIslands(char[][] grid) {
    int count = 0;
    for(int i = 0;i < grid.length;i ++)
        for(int j = 0;j < grid[0].length;j ++){//遍历整个矩阵
            if(grid[i][j] == '1'){//如果遍历到1，那么就把周围清零
                dfsFill(grid,i,j);
                count ++;//记一次
            }
        }
    return count;
   } 
   private void dfsFill(char[][] grid,int i, int j){
    if(i >= 0 && j >= 0 && i < grid.length && j < grid[0].length && grid[i][j] == '1'){//把周围临接的1全部附为0
        grid[i][j]='0';
        dfsFill(grid, i + 1, j);
        dfsFill(grid, i - 1, j);
        dfsFill(grid, i, j + 1);
        dfsFill(grid, i, j - 1);
    }
  }
}

/*
时间复杂度:O(k^n)
空间复杂度:O(k)
*/
