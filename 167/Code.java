class Solution1 {
    public int[] twoSum(int[] numbers, int target) {
        int[] res = new int [2];
            for (int i = 0; i < numbers.length; i++){
                int temp = target - numbers[i];
                for(int j = i + 1; j < numbers.length; j++){
                    if(numbers[j] == temp){
                        res[0] = i + 1;
                        res[1] = j + 1;
                        return res;
                    }
                }
            }
        return res;
    }
}

/*
时间复杂度:O(n^2)
空间复杂度:O(1)
*/


class Solution{
public int[] twoSum(int[] numbers, int target) {
    int left = 0, right = numbers.length-1;//计算出两个数的和
    while(left < right) {
        int sum = numbers[left] + numbers[right];
        if(sum == target) {
            return new int[]{left+1, right+1};//如果相等就输出
        }else if(sum > target) {//如果大于就右边的减小
            right--;
        } else {//如果小于就右边的增大
            left++;
        }
    }
    return new int[]{-1,-1};
}
}

/*
时间复杂度:O(n)
空间复杂度:O(1)
*/


