class Solution {
    public void merge(int A[], int m, int B[], int n) {
    int i=m-1, j=n-1, k=m+n-1;//一个是从A开始从后向前遍历，一个是从B开始从后向前遍历，一个是从合并后的索引开始，从后向前
    while (i>-1 && j>-1) A[k--] = (A[i] > B[j]) ? A[i--] : B[j--];//哪个大就把哪个放到合并后的最后索引处
    while (j>-1)         A[k--] = B[j--];//如果B中还有，那么就直接加进去，A中还有就在原地
}
}

/*
时间复杂度:O(m+n)
空间复杂度:O(1)
*/
