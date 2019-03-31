class Solution1 {
    public int[] sortArrayByParityII(int[] A) {
        int[] res = new int[A.length];// 用另一个数组保存
        int a = 0; int b = 1;
        for(int i = 0; i < A.length; i++){
            if(A[i] % 2 == 0){//如果是偶数就保存在偶数位，奇数就在奇数位
                res[a] = A[i];
                a+=2;
            }else{
                res[b] = A[i];
                b+=2;
            }
        }
        return res;
    }
}

/*
时间复杂度:O(n)
空间复杂度:O(n)
*/


class Solution2 {
    public int[] sortArrayByParityII(int[] A) {
        for (int i = 0; i < A.length; i += 2)//偶数位先遍历
            if (A[i] % 2 == 1) {//偶数位是否为奇数
                for(int j = 1; j < A.length; j += 2){//遍历奇数位
                 if(A[j] % 2 ==0){//奇数位是否为偶数
                     int tmp = A[i];//交换
                     A[i] = A[j];
                     A[j] = tmp;
                 }   
                }
            }
        return A;
    }
}

/*
时间复杂度:O(n^2)
空间复杂度:O(1)
*/


class Solution3 {
    public int[] sortArrayByParityII(int[] A) {
        int j = 1;
        for (int i = 0; i < A.length; i += 2)//找偶数位，查看是否为奇数
            if (A[i] % 2 == 1) {
                while (A[j] % 2 == 1)//找到奇数为的偶数
                    j += 2;

                // 交换
                int tmp = A[i];
                A[i] = A[j];
                A[j] = tmp;
            }

        return A;
    }
}

/*
时间复杂度:O(n)
空间复杂度:O(1)
*/
