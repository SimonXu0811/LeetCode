class Solution {
    public int peakIndexInMountainArray(int[] A) {
        int lo = 0, hi = A.length - 1;
        while (lo < hi) {//二分查找
            int mi = lo + (hi - lo) / 2;
            if (A[mi] < A[mi + 1])//如果有更大的值，那么向后移动
                lo = mi + 1;
            else
                hi = mi;
        }
        return lo;
    }
}

/*
时间复杂度:O(logn)
空间复杂度:O(1)
*/
