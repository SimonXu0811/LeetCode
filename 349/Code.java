class Solution{
public int[] intersection(int[] nums1, int[] nums2) {
    int M = nums1.length, N = nums2.length, k = 0;
    Set<Integer> res = new HashSet<>(), set = new HashSet<>();//一个保存小数组 一个保存相同值
    if(M <= N) {
        for(int i: nums1) set.add(i);
        for(int i=0; i < N; i++) {
            if(set.contains(nums2[i])) res.add(nums2[i]);//有相同的加进去
        }
    } else {
        return intersection(nums2,nums1);
    }
    int[] ans = new int[res.size()];//创建数组，把set的值复制进去
    for(int i: res)
        ans[k++] = i;
    return ans;
}
}

/*
时间复杂度:O(n)
空间复杂度:O(n)
*/
