class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        if(nums.length <= 0) return 0;
        
        int min = Integer.MAX_VALUE/2;
        int sum = 0;
        int left = 0;
        
        for(int i = 0; i < nums.length; i++){
            sum += nums[i];//从前向后加
            while(sum >= s){
                min = Math.min(min ,i + 1 - left);//取出子数列的最小值
                sum -= nums[left++];//找到子数列的极限
            }
        }
        
                return (min != Integer.MAX_VALUE/2) ? min : 0;//如果都不满足，那就返回0
        }
}

/*
时间复杂度:O(n)
空间复杂度:O(1)
*/
