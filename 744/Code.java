class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int low = 0, high = letters.length;
        while (low < high) {//二分查找
            int mid = low + (high - low) / 2;
            if (letters[mid] <= target) low = mid + 1;//如果不比目标大，那么就后一半
            else high = mid;//否则就前一半
        }
        return letters[low % letters.length];//防止一直移动到最后都没有找到，那么就返回最后一个
    }
}

/*
时间复杂度:O(logn)
空间复杂度:O(1)
*/
