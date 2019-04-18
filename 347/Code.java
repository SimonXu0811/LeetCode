public class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int n: nums){
            map.put(n, map.getOrDefault(n,0)+1);
        }
        
        List<Integer>[] bucket = new List[nums.length+1];
        for(int n:map.keySet()){//将value值作为索引，就是出现的频率，然后加进木桶数组中
            int freq = map.get(n);
            if(bucket[freq]==null)//如果还是空元素，那么就创建链表加进去
                bucket[freq] = new LinkedList<>();
            bucket[freq].add(n);
        }
        
        List<Integer> res = new LinkedList<>();
        for(int i=bucket.length-1; i>0 && k>0; --i){//从后向前遍历，如果是非空的数组，那么就把链表里的元素全部加进去
            if(bucket[i]!=null){
                List<Integer> list = bucket[i]; 
                res.addAll(list);
                k-= list.size();
            }
        }
        
        return res;
    }
}

/*
时间复杂度:O(m*n)
空间复杂度:O(n)
*/
