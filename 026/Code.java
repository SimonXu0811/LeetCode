class Solution1 {
    public int removeDuplicates(int[] nums) {
        HashSet<Integer> set = new HashSet<>();//用set可以判断是否出现过了
        int n = 0;
        for(int i = 0; i < nums.length; i++){
            if(!set.contains(nums[i])){
                set.add(nums[i]);//把元素加进去
            }
        }
        int res = set.size();//得到非重复元素的个数
        for(int j = 0;j < nums.length; j++){
            if(set.contains(nums[j])){//把值复制回数组
                nums[n] = nums[j];
                set.remove(nums[j]);
                n++;
            }
        }
        return res;
    }
}

/*
时间复杂度:O(n)
空间复杂度:O(n)
*/


class Solution{
public int removeDuplicates(int[] nums) {
    if (nums.length == 0) return 0;
    int i = 0;//设置一个固定指针
    for (int j = 1; j < nums.length; j++) {
        if (nums[j] != nums[i]) {//找到不等的值
            i++;//先把指针向后移一个
            nums[i] = nums[j];//复制到位置上
        }
    }
    return i + 1;
}
}

/*
时间复杂度:O(n)
空间复杂度:O(1）
*/
