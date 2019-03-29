class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0;//双指针，表示新的数组元素
        for(int j = 0; j < nums.length; j++){
            if(nums[j] == val){//等于的话就直接向后移
                continue;
            }else{
                nums[i] = nums[j];//否则复制一下
                i++;
            }
        }
        return i;
    }
}

/*
时间复杂度为:O(n)
空间复杂度为:O(1)
*/
