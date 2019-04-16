class Solution {
     public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);//两个数组排序
        Arrays.sort(nums2);
        ArrayList<Integer> ret = new ArrayList<>();//用来临时保存出现有交集的数
        for(int i = 0, j = 0; i < nums1.length && j < nums2.length; ){
            if(nums1[i] < nums2[j]){//如果一个比较小，那么就向后遍历
                i++;
            }else if(nums1[i] > nums2[j]){
                j++;
            }else{//如果两个相等就加进数组，向后遍历
                ret.add(nums1[i]);
                i++;
                j++;
            }
        }
        int[] myret = new int[ret.size()];//转成数组类型
        int index = 0;
        for(int num : ret){
            myret[index++] = num;
        }
        return myret;
    }
}

/*
时间复杂度:O(nlogn)
空间复杂度:O(n)
*/
