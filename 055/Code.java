class Solution {
    public boolean canJump(int[] A) {
    int max = 0;
    for(int i=0;i<A.length;i++){
        if(i>max) {return false;}//如果最大长度到不了最后的索引，那就是false
        max = Math.max(A[i]+i,max);//找最大的步数
    }
    return true;
    }
}

/*
时间复杂度:O(n)
空间复杂度:O(1)
*/
