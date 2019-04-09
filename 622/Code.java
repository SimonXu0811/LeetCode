class MyCircularQueue {
    int elem = 0;
    int[] que ;
    int front = 0;
    int rear = -1;
    /** Initialize your data structure here. Set the size of the queue to be k. */
    public MyCircularQueue(int k) {
        que = new int[k];//数组的可容纳大小
    }
    
    /** Insert an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(int value) {
        if(isFull()) {
            return false;
        }
        rear = (rear + 1) % que.length;//公式计算，形成环形
        que[rear] = value;
        elem++;
        return true;
    }
    
    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {
        if(isEmpty()){
            return false;
        }
        front = (front + 1) % que.length;
        elem--;
        return true;
    }
    
    /** Get the front item from the queue. */
    public int Front() {
        return isEmpty() ? -1 : que[front];//如果头尾指针相撞了，就返回-1
    }
    
    /** Get the last item from the queue. */
    public int Rear() {
          return isEmpty() ? -1 : que[rear];
    }
    
    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {
        return elem == 0;
    }
    
    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
         return elem == que.length;
    }
}

/*
时间复杂度:O(1)
空间复杂度:O(1)
*/
