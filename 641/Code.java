class MyCircularDeque {
    private final int[] arr;
    private int size;
    private int front;
    private int rear;

    /** Initialize your data structure here. Set the size of the deque to be k. */
    public MyCircularDeque(int k) {
        arr = new int[k];
        size = 0;
        front = 0;
        rear = 0;
    }
    
    /** Adds an item at the front of Deque. Return true if the operation is successful. */
    public boolean insertFront(int value) {
        if(isFull()) {//满了不能插入
            return false;
        }
        front = front == 0 ? arr.length - 1 : front - 1;//如果已经插入过一圈，还需要在头部插入，那么就转到数组末尾，否则就在前一个插入
        arr[front] = value;
        size++;
        return true;
    }
    
    /** Adds an item at the rear of Deque. Return true if the operation is successful. */
    public boolean insertLast(int value) {
        if(isFull()) {
            return false;
        }
        arr[rear] = value;
        rear = (rear + 1) % arr.length;//和环形队列一样利用公式在末尾插入
        size++;
        return true;
    }
    
    /** Deletes an item from the front of Deque. Return true if the operation is successful. */
    public boolean deleteFront() {
        if(isEmpty()) {
            return false;
        }
        front = (front + 1) % arr.length;//头指针一直指向的头，所以删前面的很好删
        size--;
        return true;
    }
    
    /** Deletes an item from the rear of Deque. Return true if the operation is successful. */
    public boolean deleteLast() {
        if(isEmpty()) {
            return false;
        }
        rear = rear == 0 ? arr.length - 1 : rear - 1;//删末尾的要把头指针向前移动，如果在数组最前端，那么就移到数组最后
        size--;
        return true;
    }
    
    /** Get the front item from the deque. */
    public int getFront() {
        if(isEmpty()) {
            return -1;
        }
        return arr[front];
    }
    
    /** Get the last item from the deque. */
    public int getRear() {
        if(isEmpty()) {
            return -1;
        }
        return arr[rear == 0 ? arr.length - 1 : rear - 1];//指针在插入之后又移动了，所以要向前一个
    }
    
    /** Checks whether the circular deque is empty or not. */
    public boolean isEmpty() {
        return size == 0;
    }
    
    /** Checks whether the circular deque is full or not. */
    public boolean isFull() {
        return size == arr.length;
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */
 
 /*
 时间复杂度:O(1)
 空间复杂度:O(1)
 */
