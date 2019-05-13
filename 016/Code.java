public class Solution {
    public int threeSumClosest(int[] num, int target) {
        int result = num[0] + num[1] + num[num.length - 1];
        Arrays.sort(num);//先整理数组
        for (int i = 0; i < num.length - 2; i++) {
            int start = i + 1, end = num.length - 1;
            while (start < end) {
                int sum = num[i] + num[start] + num[end];
                if (sum > target) {//如果差值大于零就缩小，直到最后一个大的
                    end--;
                } else {//小于零就扩大直到最后一个
                    start++;
                }
                if (Math.abs(sum - target) < Math.abs(result - target)) {//比较哪个距离更小
                    result = sum;
                }
            }
        }
        return result;
    }
}

/*
时间复杂度:O(n^2)
空间复杂度:O(n^3)
*/
