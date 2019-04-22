public class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end){
            int mid = (start + end) / 2;
            if (nums[mid] == target)
                return mid;
        
            if (nums[start] <= nums[mid]){//模糊查找mid位置，判断是不是单调的
                 if (target < nums[mid] && target >= nums[start]) //如果递减
                    end = mid - 1;
                 else
                    start = mid + 1;
            } 
        
            if (nums[mid] <= nums[end]){
                if (target > nums[mid] && target <= nums[end])//如果递增
                    start = mid + 1;
                 else
                    end = mid - 1;
            }
        }
        return -1;
    }
}

/*
时间复杂度:O(logn)
空间复杂度:O(1)
*/
