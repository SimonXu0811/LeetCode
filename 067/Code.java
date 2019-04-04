class Solution {
    public String addBinary(String a, String b) {
        
        int la=a.length()-1;
        int lb=b.length()-1;
        int count=0;//创建count，用来保存进位
        
        StringBuilder result=new StringBuilder(); //stringbuilder可以修改更新字符串

        while(la>=0 || lb>=0){//必须有一个存在
            int ca=0,cb=0;
            if(la>=0) {
                ca=a.charAt(la)-'0';la--;//a中的数字
            }

            if(lb>=0) {
                cb=b.charAt(lb)-'0';lb--;//b中的数字
            }

            int sum =ca+cb+count;//和进位一起加起来
            if(sum>=2){//如果总和大于等于2，那么就-2 count=1
                result.append(sum-2);
                count=1;
            }else{//否则直接保存，count=2
                result.append(sum);
                count=0;
            }
        }

        if(count==1) {//如果遍历完还有进位，就直接加进去
            result.append(carryIn);
        }
        return result.reverse().toString();//旋转 转成字符串
    }
}

/*
时间复杂度:O(n)
空间复杂度:O(n)
*/
