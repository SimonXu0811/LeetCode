class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);//先排序
        int res = 0;
        for(int i = 0; i < nums.length; i += 2){//两两组合取前一个
            res += nums[i];
        }
        return res;
    }
}

/*
时间复杂度:O(n)
空间复杂度:O(1)
*/
