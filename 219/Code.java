class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < nums.length; i++){//遍历数组
            if(i > k) set.remove(nums[i-k-1]);//删除最前面的一个元素
            if(!set.add(nums[i])) return true;//不能加就是重复了
        }
        return false;
 }
}

/*
时间复杂度:O(n)
空间复杂度:O(k)
*/
