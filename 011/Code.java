public class Solution {
    public int maxArea(int[] height) {
        int maxarea = 0, l = 0, r = height.length - 1;//一个左指针，一个右指针
        while (l < r) {
            maxarea = Math.max(maxarea, Math.min(height[l], height[r]) * (r - l));
            if (height[l] < height[r])//取短边移动，让两个长度足够接近
                l++;
            else
                r--;
        }
        return maxarea;
    }
}

/*
时间复杂度:O(n)
空间复杂度:O(1)
*/
