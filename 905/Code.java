class Solution1 {
    public int[] sortArrayByParity(int[] A) {
        int[] ans = new int[A.length];//创建一个临时数组，用来先储存偶数，再储存奇数
        int t = 0;

        for (int i = 0; i < A.length; ++i)
            if (A[i] % 2 == 0)
                ans[t++] = A[i];//先把偶数存完

        for (int i = 0; i < A.length; ++i)
            if (A[i] % 2 == 1)
                ans[t++] = A[i];//再存奇数

        return ans;
    }
}

/*
时间复杂度:O(n)
空间复杂度:O(n)
*/




class Solution2 {
    public int[] sortArrayByParity(int[] A) {
        int i = 0, j = A.length - 1;//双指针
        while (i < j) {
            if (A[i] % 2 > A[j] % 2) {//前为奇数后为偶数时，交换
                int tmp = A[i];
                A[i] = A[j];
                A[j] = tmp;
            }

            if (A[i] % 2 == 0) i++;//前为偶数时，跳过
            if (A[j] % 2 == 1) j--;//后为奇数时，跳过
        }

        return A;
    }
}

/*
时间复杂度:O(n)
空间复杂度:O(1)
*/
