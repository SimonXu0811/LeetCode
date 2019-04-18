class Solution {
    public int nthSuperUglyNumber(int n, int[] primes) {
        if(n==1) return 1;
        PriorityQueue<Long> q = new PriorityQueue();//用优先级队列生成一个最小堆
        q.add(1L);
    
        for(long i=1; i<n; i++) {//在堆中插入数据，把每个因子都和它的质数相乘
           long tmp = q.poll();
           while(!q.isEmpty() && q.peek()==tmp) tmp = q.poll();//找出最小堆的最后一个因子，分别再与后面的相乘
           for(int j = 0; j < primes.length; j++){
               q.add(tmp * (long)primes[j]);
           }
        }
        return q.poll().intValue();//得到最后一个
    }
}

/*
时间复杂度:O(kn)
空间复杂度:O(n)
*/
