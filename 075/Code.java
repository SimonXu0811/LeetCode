class Solution {
    public void sortColors(int[] nums) {
        int start = 0, end = nums.length - 1, index = 0;//三个指针
        while(index <= end){//遍历整个数组
            if(nums[index] == 0){//如果是0，那么换到头去，头指针向后移一个
                nums[index] = nums[start];
                nums[start++] = 0;
            }
            else if(nums[index] == 2){//如果是2，那么换到尾去，尾指针减1，并且index不变动继续判断
                nums[index] = nums[end];
                nums[end--] = 2;
                continue;
            }
            index ++;//1就不变向后移动
        }
    }
}

/*
时间复杂度:O(n)
空间复杂度:O(1)
*/
