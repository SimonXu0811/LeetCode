class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i : nums){//遍历数组中所有的数值
            if(!set.add(i)){//不能加就是重复了，就返回true
                return true;
            }
            else{//否则就加进去
                set.add(i);
            }
        }
        return false;
    }
}

/*
时间复杂度:O(n)
空间复杂度:O(n)
*/
