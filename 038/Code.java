class Solution {
    public static String countAndSay(int n) {
        return helper(n, "1");
    }

    public static String helper(int n, String str) {
        if (n == 1) {//需要递归的次数
            return str;
        }
        StringBuilder sb = new StringBuilder();//创建sb用来修改字符串
        char[] nums = str.toCharArray();//转成数组的形式
        char pre = nums[0];//把pre记做是第一个出现的字符
        int count = 1;//然后次数默认为1
        for (int i = 1; i < nums.length; i++) {//开始遍历字符串
            if (nums[i] == pre) {//如果后面的相等，那么就次数加一
                count++;
            }
            else {//否则先打印出来，然后pre为其他的字符，重置count为1
                sb.append(count);
                sb.append(pre);
                pre = nums[i];
                count = 1;
            }
        }
        // add the occurrence number of the last few numbers to the "str"
        sb.append(count);
        sb.append(pre);
        return helper(n-1, sb.toString());//递归
    }
}

/*
时间复杂度:O(1)
空间复杂度:O(1)
*/
