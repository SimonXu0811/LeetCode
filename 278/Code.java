/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        long l = 1, h = n;
        while(l < h){//二分，最后两个指针碰撞了就是这个值
            long mid = (h + l) / 2;
            if(isBadVersion((int)mid)){
                h = mid;
            }
            else{
                l = mid + 1;
            }
        }
        return (int)l;
    }
}

/*
时间复杂度:O(logn)
空间复杂度:O(1)
*/
