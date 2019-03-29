class Solution1 {
    public int missingNumber(int[] nums) {
        int res = nums.length;//需要将0～n以及nums[0]~nums[nums.length-1]异或
        for(int i = 0; i < nums.length; i++){
            res ^= (i ^ nums[i]);//相同的数异或会为0
        }
        return res;
    }
}

/*
时间复杂度:O(n)
空间复杂度:O(1)
*/



class Solution2 {
    public int missingNumber(int[] nums) {//把整数相加做差就知道少了哪个
        int expectedSum = nums.length*(nums.length + 1)/2;
        int actualSum = 0;
        for (int num : nums) actualSum += num;
        return expectedSum - actualSum;
    }
}

/*
时间复杂度:O(n)
空间复杂度:O(1)
*/


class Solution3 {
    public int missingNumber(int[] nums) {
        Set<Integer> numSet = new HashSet<Integer>();
        for (int num : nums) numSet.add(num);

        int expectedNumCount = nums.length + 1;
        for (int number = 0; number < expectedNumCount; number++) {
            if (!numSet.contains(number)) {
                return number;
            }
        }
        return -1;
    }
}

/*
时间复杂度:O(n)
空间复杂度:O(n)
*/



class Solution4 {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);//归并给数组排序

        if (nums[nums.length-1] != nums.length) {//判断最后一个是否符合
            return nums.length;
        }
        
        else if (nums[0] != 0) {//判断第一个是否符合
            return 0;
        }
        
        for (int i = 1; i < nums.length; i++) {//判断中间的是否符合
            int expectedNum = nums[i-1] + 1;
            if (nums[i] != expectedNum) {
                return expectedNum;
            }
        }
        return -1;
    }
}

/*
时间复杂度:O(nlogn)
空间复杂度:O(1)
*/
