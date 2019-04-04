class Solution{
	public int  numMagicSquaresInside (int[][] grid) {
		int R = grid.length;
		int C = grid[0].length;
		int res = 0;
		
		for(int r = 0; r < R - 2; r++) {
			for(int c = 0; c < C - 2; c++) {//遍历所有的顶点，从顶点开始扩展
				if(grid[r+1][c+1] != 5) {//如果中间数不为5，那么不合法，所以下一个矩阵
					continue;
				}
				if(helper(grid[r][c],grid[r][c+1],grid[r][c+2],
				          grid[r+1][c],grid[r+1][c+1],grid[r+1][c+2],
				          grid[r+2][c],grid[r+2][c+1],grid[r+2][c+2])){//将每个值调用，判断合法性
					res++;
				}
			}
		}
		return res;
	}
	
	private boolean helper(int ... vals) {
		int[] counter = new int [16];//由于元素的大小只会从0-15，所以创建一个长度为16的数组
		for(int v : vals) counter[v]++;//将出现的元素大小记录
		for(int i = 1; i <= 9; i++) {//判断9个数中是否为0或为10 或者重复出现5
			if(counter[i] != 1) {
				return false;
			}
		}
		return (vals[0]+vals[1]+vals[2] == 15&&
				vals[3]+vals[4]+vals[5] == 15&&
				vals[6]+vals[7]+vals[8] == 15&&
				vals[0]+vals[3]+vals[6] == 15&&
				vals[1]+vals[4]+vals[7] == 15&&
				vals[2]+vals[5]+vals[8] == 15&&
				vals[0]+vals[4]+vals[8] == 15&&
				vals[2]+vals[4]+vals[6] == 15);//每个行列对角线都需要满足
	}
}

/*
时间复杂度:O(n)
空间复杂度:O(1)
*/
