class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(String s : tokens){
            if(s.equals("+")){//如果是运算法，就弹出最顶上的两个计算
                stack.push(stack.pop() + stack.pop());
            }else if(s.equals("-")){
                stack.push((stack.pop() - stack.pop()) * -1);
            }else if(s.equals("*")){
                stack.push(stack.pop()*stack.pop());
            }else if(s.equals("/")){
                int temp = stack.pop();
                stack.push(stack.pop() / temp);
            }else{//如果不是就直接入栈
                stack.push(Integer.valueOf(s));
            }
        }
        return stack.pop();//最后的就是答案
    }
}

/*
时间复杂度:O(n)
空间复杂度:O(n)
*/
