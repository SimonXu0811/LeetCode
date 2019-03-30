class Solution1 {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length/2];//排序过后必定有一个数会超过中间位置
    }
}

/*
时间复杂度:O(nlogn)
空间复杂度:O(1)
*/


class Solution2 {
    public int majorityElement(int[] nums) {
        int majorityCount = nums.length/2;

        for (int num : nums) {//遍历数组开始计算出现的总次数
            int count = 0;
            for (int elem : nums) {
                if (elem == num) {
                    count += 1;
                }
            }

            if (count > majorityCount) {//出现次数超过一半，肯定就是众数
                return num;
            }

        }

        return -1;    
    }
}

/*
时间复杂度:O(n^2)
空间复杂度:O(1)
*/


class Solution3 {
    public int majorityElement(int[] nums) {
        int count = 0;
        Integer candidate = null;

        for (int num : nums) {//找数，并定有一个数字会比另一个出现的数字多1
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;//出现一次+1 没出现-1，最后必定有个数字会多出现一次
        }

        return candidate;
    }
}

/*
时间复杂度:O(n)
空间复杂度:O(1)
*/
