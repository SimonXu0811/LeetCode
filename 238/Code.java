class Solution {
    public int[] productExceptSelf(int[] nums) {
    int[] result = new int[nums.length];
    for (int i = 0, tmp = 1; i < nums.length; i++) {//先错位，后面的等于前面的所有数之积
        result[i] = tmp;
        tmp *= nums[i];
    }
    for (int i = nums.length - 1, tmp = 1; i >= 0; i--) {//然后在乘上原数组的前一位
        result[i] *= tmp;
        tmp *= nums[i];
    }
    return result;
}
}

/*
时间复杂度:O(n)
空间复杂度:O(1)
*/
