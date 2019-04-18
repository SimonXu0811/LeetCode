public class Solution {
    public int nthUglyNumber(int n) {
        PriorityQueue<Long> heap = new PriorityQueue<>();//创建一个堆
        heap.add(1L); 
        long count = 0, currMin = 0;
        while(count < n){//需要添加的个数
            currMin = heap.poll();//弹出一个做为下一个的因子
            count++;
            if(currMin * 2 > Integer.MAX_VALUE) break;//丑树都是*2 *3 *5的顺序，所以如果*2已经超出了就不用管了
            heap.add(currMin * 2);
            if(currMin % 2 != 0){//如果不是2的倍数，那么就*3
                heap.add(currMin * 3);
                if(currMin % 3 != 0){//如果不是2和3的倍数，那么就*5， 总是保证235235的顺序
                    heap.add(currMin * 5);
                }
            }
        }
        while(count < n){//一直弹出n次
            currMin = heap.poll();
            count++;
        }
        return (int)currMin;
    }    
}

/*
时间复杂度:O(logn)
空间复杂度:O(n)
*/
