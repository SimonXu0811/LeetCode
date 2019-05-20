class Solution {
    public int[][] generateMatrix(int n) {
        int[][] res = new int [n][n];
        int num = 1;
        int startR = 0;
        int endR = n - 1;
        int startC = 0;
        int endC = n - 1;
        
        if(n == 0){
            return res;
        }
        while(startR <= endR && startC <= endC){
            for(int i = startC; i <= endC; i++){ //上层
                res[startR][i] = num++;
            }
            startR ++;//运行完向里面靠
            
            for(int i = startR; i <= endR; i++){//右层
                res[i][endC] = num++;
            }
            endC--;//向里面靠
            
            for(int i = endC; i >= startC; i--){//下层
                     res[endR][i] = num++;
            }
            endR--;//向里面靠
            
            for(int i = endR; i >= startR; i--){//左层
                res[i][startC] = num++;
            }
            startC ++;//向里面靠
        }
        
        return res;
    }
}

/*
时间复杂度:O(n)
空间复杂度:O(1)
*/
