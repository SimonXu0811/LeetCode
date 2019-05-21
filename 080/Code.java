class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;//索引指针
        for (int n : nums)
            if (i < 2 || n > nums[i - 2])//小于2复制，隔两个之后还不相等，就复制
                nums[i++] = n;
        return i;
    }
}

/*
时间复杂度:O(n)
空间复杂度:O(1)
*/
