class Solution {
    public String simplifyPath(String path) {
        Deque<String> stack = new LinkedList<>();//双端对列，stack弹出，最后返回先进先出的
        for(String s:path.split("/")){//遇到..就返回上一层的路径
            if(s.equals("..")&&!stack.isEmpty()){
                    stack.pop();
                }
            if(s.equals(".")||s.equals("")||s.equals("..")) continue;//不保存. .. 
            else stack.push(s);//只保存路径名称
            }
        StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){//从底部开始输出
            sb.append("/"+stack.pollLast()+"");
        }
        return sb.length() == 0 ? "/" : sb.toString();//如果为空就返回/
    }
}

/*
时间复杂度:O(n)
空间复杂度:O(n)
*/
