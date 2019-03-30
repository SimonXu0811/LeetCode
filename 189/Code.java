class Solution1 {
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

/*
时间复杂度:O(n*k)
空间复杂度:O(1)
*/



public class Solution2 {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        int count = 0;
        for (int start = 0; count < nums.length; start++) {
            int current = start;
            int prev = nums[start];
            do {
                int next = (current + k) % nums.length;
                int temp = nums[next];
                nums[next] = prev;
                prev = temp;
                current = next;
                count++;
            } while (start != current);
        }
    }
}

/*
时间复杂度:O(n)
空间复杂度:O(1)
*/
