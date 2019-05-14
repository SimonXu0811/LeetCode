class Solution {
    public int searchInsert(int[] nums, int target) {
        int low = 0, high = nums.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid] == target) return mid;//找到了相等的数
            else if(nums[mid] > target) high = mid-1;//如果大了向前移动
            else low = mid+1;//小了向后移动
        }
        return low;
    }
}

/*
时间复杂度:O(logn)
空间复杂度:O(1)
*/
