class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> que  = new PriorityQueue<>();
        
        for(int i : nums){//先生成一个最小堆
            que.add(i);
        }
        
        int count = 0;
        
        while(count++ != nums.length - k){//poll 出length - k个数
            que.poll();
        }
        
        return que.poll();//然后poll出下一个
    }
}

/*
时间复杂度:O(n)
空间复杂度:O(n)
*/
