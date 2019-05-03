class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l1 = nums1.length;
        int l2 = nums2.length;
        int[] merge = new int[l1 + l2];//归并之后的数组
        int index = 0;
        int i1 = 0;
        int i2 = 0;
        while(i1 < l1 && i2 < l2){//哪个小就哪个排在前面
            if(nums1[i1] < nums2[i2]){
                merge[index++] = nums1[i1++];
            }else{
                merge[index++] = nums2[i2++];
            }
        }
        while(i1 < l1){//只有l1就直接放进去
            merge[index++] = nums1[i1++];
        }
        while(i2 < l2){//只有l2就直接放进去
            merge[index++] = nums2[i2++];
        }
        
        return (l1 + l2) % 2 != 0 ? (double)merge[(merge.length - 1) / 2] : (double)(((double)merge[merge.length / 2] + (double)merge[merge.length / 2 - 1]) / 2);//根据数组长度的奇偶性判断计算方法
    }
}

/*
时间复杂度:O(nlogn)
空间复杂度:O(n)
*/
