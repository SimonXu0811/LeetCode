/*
Time O(n)
Space O(1)
  */
class Solution1 {
    public int singleNumber(int[] nums) {
        int res=0;
        for(int num : nums){
            res ^= num;
        }
        return res;
    }
}

/*
Time O(nlgn)
Space O(n)
*/
class Solution2 {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int i=0;
        while(i<nums.length-1){
            if(nums[i]==nums[i+1]){
                i+=2;
            }else{
                return nums[i];
            }
        }
        return nums[nums.length-1];
    }
}
