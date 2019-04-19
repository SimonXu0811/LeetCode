class Solution {
    public int surfaceArea(int[][] grid) {
         int res = 0; 
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] > 0) res += 4 * grid[i][j] + 2;//正常情况下就是高度乘4加两个底
                if(i < grid.length - 1) res -= (Math.min(grid[i][j],grid[i+1][j])*2);//然后如果与左右重合的，那么就减去最小高度的两个面
                if(j < grid.length - 1) res -= (Math.min(grid[i][j],grid[i][j+1])*2);//如果上下重合的，那么就减去最小高度的两个面
            }
        }
        return res;
    }
}

/*
时间复杂度:O(n)
空间复杂度:O(n)
*/
