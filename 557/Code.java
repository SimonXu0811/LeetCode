class Solution {
    public String reverseWords(String s) {
        String[] temp = s.trim().split("\\s+");//将字符串通过空格分割
        StringBuilder res = new StringBuilder();//保存临时的新字符串
        for(int i = 0; i < temp.length; i++){//一个一个元素进行旋转
            StringBuilder s1 = new StringBuilder(temp[i]);//通过sb旋转
            res.append(s1.reverse());
            res.append(" ");//每个添加空格
        }
        return res.toString().trim();
    }
}

/*
时间复杂度:O(n)
空间复杂度:O(n)
*/
