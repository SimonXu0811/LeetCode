class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        if(matrix.length == 0) return list;//判断空矩阵
        int startC = 0;
        int endC = matrix[0].length - 1;
        int startR = 0;
        int endR = matrix.length - 1;
        
        while(startC <= endC && startR <= endR){
            for(int i = startC; i <= endC; i++){//上层
                list.add(matrix[startR][i]);
            }
            startR ++;//向下移动
            
            for(int i = startR; i <= endR; i++){//右层
                list.add(matrix[i][endC]);
            }
            endC--;//向左移动
            
            for(int i = endC; i >= startC; i--){//下层
                if(startR <= endR)//判断移动之后的是否重合了
                list.add(matrix[endR][i]);
            }
            endR --;//向上移动
            
            for(int i = endR; i >= startR; i--){//左层
                if(startC <= endC)
                list.add(matrix[i][startC]);
            }
            startC ++;//向右移动
        }
        return list;
    }
}

/*
时间复杂度:O(n)
空间复杂度:O(1)
*/
