class Solution {
    public int longestMountain(int[] A) {
        int result=0;
        for(int i=1;i<A.length;i++){//假设i是最高的
            int rightIndex=i;
            int leftIndex=i;
            while(rightIndex < A.length - 1 && A[rightIndex] > A[rightIndex+1]){//右侧递减
                rightIndex++;
            }
            while(leftIndex > 0 && A[leftIndex] > A[leftIndex-1]){//左侧递增
                leftIndex--;
            }
            
            int temp = rightIndex - leftIndex < 2 || rightIndex == i || leftIndex == i?0 : rightIndex - leftIndex + 1;//如果长度不能计算，或者没有动，那么就是0，否则就返回长度
            
            if(result < temp) result = temp;//取最大的长度
        }
        return result;
    }
}

/*
时间复杂度:O(m*n)
空间复杂度:O(1)
*/
