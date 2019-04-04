class Solution {
    public static int compareVersion(String version1, String version2) {
        int l1 = version1.length(), l2 = version2.length();//判断长度，如果没有了，那么后面的都等于0
        int l = 0, r = 0;//两个指针分别指version1和version2
        int val1 = 0, val2 = 0;//两个点之间的值初始为1
        while(l<l1 || r<l2){//直到两个都没有
            while(l < l1 && version1.charAt(l) != '.'){//找到两个点之间的数字
                val1 = 10 * val1 + (version1.charAt(l) - '0');//避免开头0的出现
                l++;//移动指针
            }
            
            while(r < l2 && version2.charAt(r) != '.'){
                val2 = 10*val2 + (version2.charAt(r) - '0');
                r++;
            }
            
            if(val1 > val2) return 1;
            else if(val1 < val2) return -1;//判断
            else{//比较值初始化，然后移动指针
                val1 = 0;
                val2 = 0;
                l++;
                r++;
            }
        }
        return 0;
    }
}

/*
时间复杂度:O(n)
空间复杂度:O(1)
*/
