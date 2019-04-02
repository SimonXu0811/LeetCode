public class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0, sum = 0;
        HashMap < Integer, Integer > map = new HashMap < > ();
        map.put(0, 1);//先保存0，记录第一次出现
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (map.containsKey(sum - k))//如果有，那么久count加上出现的次数
                count += map.get(sum - k);
            map.put(sum, map.getOrDefault(sum, 0) + 1);//把从前向后的sum加进hashmap中
        }
        return count;
    }
}

/*
时间复杂度:O(n)
空间复杂度:O(n)
*/
