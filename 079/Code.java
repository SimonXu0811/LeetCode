class Solution {
    public boolean exist(char[][] board, String word) {
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                if(check(board, word, i, j, 0)){//遍历所有的举证来查找
                    return true;
                }
            }
        }
        return false;
    }
    
    private boolean check(char[][] board, String word, int i, int j, int l){
        if(l == word.length()) return true;//结束的条件就是全匹配
        if(i < 0 || j < 0 || i == board.length || j == board[i].length) return false;//如果超过边界也返回
        if(board[i][j] != word.charAt(l)) return false;//值不相等也返回
        board[i][j] ^= 256;//表示访问过一次了
        boolean isTrue = check(board,word, i + 1, j, l + 1)||
                         check(board,word, i - 1, j, l + 1)||
                         check(board,word, i, j + 1, l + 1)||
                         check(board,word, i, j - 1, l + 1);//访问四个角
        board[i][j] ^= 256;//两次异或回到本身，回溯
        return isTrue;
    }
}

/*
时间复杂度:O(n*n!)
空间复杂度:O(n)
*/
