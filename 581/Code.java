public class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        boolean flag = false;
        for (int i = 1; i < nums.length; i++) {//从前向后遍历，如果有一个元素比前一个小的话，那就标记这个元素
            if (nums[i] < nums[i - 1])
                flag = true;
            if (flag)
                min = Math.min(min, nums[i]);
        }
        flag = false;
        for (int i = nums.length - 2; i >= 0; i--) {//从后向前遍历，如果一个元素比后面的要大，那么标记这个元素
            if (nums[i] > nums[i + 1])
                flag = true;
            if (flag)
                max = Math.max(max, nums[i]);
        }
        int l, r;
        for (l = 0; l < nums.length; l++) {//找到这个元素的前一个的索引
            if (min < nums[l])
                break;
        }
        for (r = nums.length - 1; r >= 0; r--) {//找到这个元素后一个的索引
            if (max > nums[r])
                break;
        }
        return r - l < 0 ? 0 : r - l + 1;//获取两个索引的长度
    }
}

/*
时间复杂度:O(n)
空间复杂度:O(1)
*/
