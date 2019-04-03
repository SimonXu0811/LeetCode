class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max = 0;
        for(int i : nums){//遍历数组
            if(i == 1){//等于1那就长度加一
                count ++;
            }
            if(i == 0){//等于0那么取出最大值，长度归零
                max = Math.max(max, count);
                count = 0;
            }
        }
      
        return Math.max(max,count);  //如果最后一个不为零，那么再取一次最大值
    }
}

/*
时间复杂度: O(n)
空间复杂度: O(1)
*/
