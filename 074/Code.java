class Solution {
   public boolean searchMatrix(int[][] matrix, int target) {
	
	int row_num = matrix.length;
  if(row_num == 0) return false;//判断是否为空矩阵
	int col_num = matrix[0].length;
	
	int begin = 0, end = row_num * col_num - 1;//展开成一个有序的数组
	
	while(begin <= end){//二分搜索
		int mid = (begin + end) / 2;
		int mid_value = matrix[mid/col_num][mid%col_num];//分别找到索引
		
		if( mid_value == target){//找到了
			return true;
		
		}else if(mid_value < target){//找到比目标值小的，移动右边指针
			begin = mid+1;
		}else{//否则移动左边指针
			end = mid-1;
		}
	}
	
	return false;
}
}

/*
时间复杂度:O(logn)
空间复杂度:O(1)
*/
