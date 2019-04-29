class Solution {
    List<String> list = new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        backtrace(0,0,n,"");
        return list;
    }
    
    private void backtrace( int left, int right, int n, String s){
        if(left == n && right == n){//两个括号都用完了，那么就结束
            list.add(s);
        }
        
        if(left < n){//如果左括号有，就加左括号
            backtrace(left + 1,right,n,s + "(");
        }//判断结束回溯上一层
        if(right < n && left > right){//右括号有并且右括号小于左括号个数，就加右括号
            backtrace(left,right + 1,n,s + ")");
        }//判断结束回溯上一层
 
    }
}

/*
时间复杂度:O(n!)
空间复杂度:O(n)
*/
