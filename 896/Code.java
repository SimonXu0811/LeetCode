class Solution1 {
    public boolean isMonotonic(int[] A) {
        return increasing(A)||decreasing(A);//分别判断是否是单增函数还是单减函数
    }
    public boolean increasing(int[] A){//单增为true，非单增再判断单减
        for(int i = 0; i < A.length-1; i++){
            if(A[i+1] < A[i]){
                return false;
            }
        }
        return true;
    }
    public boolean decreasing(int[] A){单减为true
        for(int i = 0; i < A.length-1; i++){
            if(A[i+1] > A[i]){
                return false;
            }
        }
        return true;
    }
}

/*
时间复杂度:O(n)
空间复杂度:O(1)
*/


class Solution2 {
    public boolean isMonotonic(int[] A) {
        boolean increasing = true;
        boolean decreasing = true;
        for (int i = 0; i < A.length-1; i++){
            if(A[i] > A[i+1]){
                increasing = false;
            }//有一个为减，那么就不是递增函数
            if(A[i] < A[i+1]){
                decreasing = false;
            }//有一个为增，那就不是递减函数
        }
        return increasing||decreasing;//非增非减就为false
    }
}

/*
时间复杂度:O(n)
空间复杂度:O(1)
*/


class Solution3 {
    public boolean isMonotonic(int[] A) {
        int store = 0;
        for (int i = 0; i < A.length - 1; ++i) {
            int c = Integer.compare(A[i], A[i+1]);//调用compare方法，如果相等为0，大于为1，小于为-1
            if (c != 0) {
                if (c != store && store != 0)//如果一个大于一个小于就false
                    return false;
                store = c;//否则储存，向后遍历
            }
        }

        return true;
    }
}

/*
时间复杂度:O(n)
空间复杂度:O(1)
*/
