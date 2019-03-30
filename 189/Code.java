class Solution {
    public void rotate(int[] nums, int k) {
        if(k==0){
            return;
        }
        int temp = nums[nums.length-1];
        for(int i = nums.length-2; i >= 0; i--){
            nums[i+1] = nums[i];
        }
        nums[0] = temp;
        rotate(nums,k-1);
    }
}
