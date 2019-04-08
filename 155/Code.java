class MinStack {
    Stack<Integer> stack;
    int min = Integer.MAX_VALUE;
    /** initialize your data structure here. */
    public MinStack() {//初始话栈
        stack = new Stack<>();
    }
    
    public void push(int x) {//如果x比min小，就把旧的min加进去，然后再加x 最后行成的是x1|min1|x2|min2|x3|min3|
        if(x <= min){
            stack.push(min);
            min = x;
        }
        stack.push(x);
    }
    
    public void pop() {
        if(stack.pop() == min){//如果要删除的x是最小值的话，那么就再pop一次去获取上一次的最小值
            min = stack.pop();
        }
    }
    
    public int top() {//直接用stack.peek()
        return stack.peek();
    }
    
    public int getMin() {//返回最小值
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
