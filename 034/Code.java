class Solution {
    private int extremeInsertionIndex(int[] nums, int target, boolean left) {//二分法搜索
        int lo = 0;
        int hi = nums.length;

        while (lo < hi) {
            int mid = (lo + hi) / 2;
            if (nums[mid] > target || (left && target == nums[mid])) {//对于左边就是有重复的还要继续分，直到没有重复的目标值
                hi = mid;
            }
            else {//右边就是有重复的一直向后移动
                lo = mid+1;
            }
        }

        return lo;
    }

    public int[] searchRange(int[] nums, int target) {
        int[] targetRange = {-1, -1};

        int leftIdx = extremeInsertionIndex(nums, target, true);
        if (leftIdx == nums.length || nums[leftIdx] != target) {//如果搜索到结束都没有
            return targetRange;
        }

        targetRange[0] = leftIdx;
        targetRange[1] = extremeInsertionIndex(nums, target, false)-1;

        return targetRange;
    }
}

/*
时间复杂度:O(logn)
空间复杂度:O(1)
*/
