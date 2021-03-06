public class Solution {
    public void nextPermutation(int[] nums) {
        int i = nums.length - 2;
        while (i >= 0 && nums[i + 1] <= nums[i]) {//找到第一个递减数
            i--;
        }
        if (i >= 0) {
            int j = nums.length - 1;
            while (j >= 0 && nums[j] <= nums[i]) {//找到第一个大于递减数的值
                j--;
            }
            swap(nums, i, j);//交换
        }
        reverse(nums, i + 1);//都满足就全部旋转，比如54321，下一个数就是12345
    }

    private void reverse(int[] nums, int start) {
        int i = start, j = nums.length - 1;
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}

/*
时间复杂度:O(n)
空间复杂度:O(1)
*/
