class Solution {
    public boolean isValidSudoku(char[][] board) {
        return checkRow(board)&&checkCol(board)&&checkBlock(board);//有一个不行就不行
    }
    
    private boolean checkRow(char[][] board){//判断行
        for(int i = 0; i < board[0].length; i++){
            HashSet set = new HashSet();//用set记录是否有重复值
            for(int j = 0; j < board.length; j++){
                if(board[j][i] == '.') continue;
                if(!set.add(board[j][i])) return false;
            }
        }
        return true;
    }
    
    private boolean checkCol(char[][] board){//判断列
        for(int i = 0; i < board[0].length; i++){
            HashSet set = new HashSet();//用set记录是否有重复值
            for(int j = 0; j < board.length; j++){
                if(board[i][j] == '.') continue;
                if(!set.add(board[i][j])) return false;
            }
        }
        return true;
    }
    
    private boolean checkBlock(char[][] board){//判断九宫格
        for(int j = 0; j < board[0].length; j += 3){
            for(int i = 0; i < board.length; i += 3){//每次移动加3
                HashSet set = new HashSet();
                for(int row = i; row < i+3; row++){//遍历九宫格里的所有点
                    for(int col = j; col < j+3; col++){
                        if(board[row][col] == '.') continue;
                        if(!set.add(board[row][col])) return false;//有重复就false
                    }
                }
            }
        }
        return true;
    }
}

/*
时间复杂度:O(n)
空间复杂度:O(1)
*/
