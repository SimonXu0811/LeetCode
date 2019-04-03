class Solution {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        int leftsum = 0;
        for(int i : nums) sum+=i;//计算总和
        for(int i = 0; i < nums.length; i++){//遍历数组，计算右半边的和
           if(leftsum == sum -leftsum - nums[i]){//判断左右是否相等
               return i;
           }
            leftsum += nums[i];//计算左半边的和
        }
        return -1;
    }
}

/*
时间复杂度:O(n)
空间复杂度:O(1)
*/
