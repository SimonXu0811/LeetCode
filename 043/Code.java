class Solution {
    public String multiply(String num1, String num2) {
    int m = num1.length(), n = num2.length();
    int[] pos = new int[m + n];//先保存好要储存的空间
   
    for(int i = m - 1; i >= 0; i--) {
        for(int j = n - 1; j >= 0; j--) {//找每个数的索引
            int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0'); //两两相乘
            int p1 = i + j, p2 = i + j + 1;//找到要保存的十位和个位的位置
            int sum = mul + pos[p2];//先加上之前的进位

            pos[p1] += sum / 10;//保存十位
            pos[p2] = (sum) % 10;//保存个位
        }
    }  
    
    StringBuilder sb = new StringBuilder();//转换成字符串类型
    for(int p : pos) if(!(sb.length() == 0 && p == 0)) sb.append(p);
    return sb.length() == 0 ? "0" : sb.toString();
    }
}

/*
时间复杂度:O(n*m)
空间复杂度:O(n+m)
*/
