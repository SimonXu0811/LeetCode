class Solution1 {
    public void rotate(int[] nums, int k) {
        if(k==0){
            return;
        }
        int temp = nums[nums.length-1];
        for(int i = nums.length-2; i >= 0; i--){//将数组旋转一次
            nums[i+1] = nums[i];
        }
        nums[0] = temp;
        rotate(nums,k-1);//递归，旋转到次数为0
    }
}

/*
时间复杂度:O(n*k)
空间复杂度:O(1)
*/



public class Solution2 {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        int count = 0;
        for (int start = 0; count < nums.length; start++) {//遍历数组，找索引直接转到正确的位置
            int current = start;
            int prev = nums[start];
            do {
                int next = (current + k) % nums.length;//计算出正确的位置
                int temp = nums[next];
                nums[next] = prev;
                prev = temp;//交换数组
                current = next;
                count++;
            } while (start != current);//如果最后转移的位置等于初始位置，就算完成
        }
    }
}

/*
时间复杂度:O(n)
空间复杂度:O(1)
*/
