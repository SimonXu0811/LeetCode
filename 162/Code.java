public class Solution {
    public int findPeakElement(int[] nums) {
        int l = 0, r = nums.length - 1;
        while (l < r) {//二分法
            int mid = (l + r) / 2;
            if (nums[mid] > nums[mid + 1])//只要比后面大就是凸出来的
                r = mid;
            else//否则看后面的一半
                l = mid + 1;
        }
        return l;
    }
}

/*
时间复杂度:O(logn)
空间复杂度:O(1)
*/
