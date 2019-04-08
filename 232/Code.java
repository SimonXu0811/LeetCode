class MyQueue {
    Stack<Integer> stack1;
    Stack<Integer> stack2;
    int front;//用来保存最上层的值
    /** Initialize your data structure here. */
    public MyQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        if(stack1.isEmpty()){//如果没有附过值，那么就设为front
            front = x;
        }
        stack1.push(x);
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
       if(stack2.isEmpty()){//复制到stack2中
           while(!stack1.isEmpty()){
               stack2.push(stack1.pop());
           }
       }
        return stack2.pop();//删除最上层元素
    }
    
    /** Get the front element. */
    public int peek() {
        if(!stack2.isEmpty()){//如果已经复制过了，那么peek就可以
            return stack2.peek();
       }
        return front;//如果没有就不用在复制了，直接返回front
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return stack2.isEmpty()&&stack1.isEmpty();//如果有一个不为空那么就不是空了
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */
 
 /*
 时间复杂度 pop为:O(n) peek和empty为:O(1)
 空间复杂度:O(n)
 */
