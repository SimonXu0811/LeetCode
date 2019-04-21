class Solution {
    public int findMin(int[] nums) {
        int start=0;int mid=0;
        int end=nums.length-1;
        while(start<=end){//二分法
            mid=(start+end)/2;
            if((mid>=1&&nums[mid]<nums[mid-1])||(mid==0&&nums[mid]<nums[nums.length-1]))
                return nums[mid];
            if(nums[end]<nums[mid]){//如果递减，那么就向后移动
                start=mid+1;
            }else{//否则向前移动
                end=mid-1;
            }
        }
        return nums[start];
    }
}

/*
时间复杂度:O(logn)
空间复杂度:O(1)
*/
