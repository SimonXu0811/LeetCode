class Solution {
   public int maxProduct(int[] A) {
    if (A.length == 0) {
        return 0;
    }
    
    int maxpre = A[0];//初始化
    int minpre = A[0];
    int res = A[0];
    int max, min;
    
    for (int i = 1; i < A.length; i++) {
        max = Math.max(Math.max(maxpre * A[i], minpre * A[i]), A[i]);//找到连续的最大值
        min = Math.min(Math.min(maxpre * A[i], minpre * A[i]), A[i]);//找到连续的最小值
        res = Math.max(max, res);//保存最大的那个
        maxpre = max;//记录以便继续比较
        minpre = min;
    }
    return res;
   }
}

/*
时间复杂度:O(n)
空间复杂度:O(1)
*/
