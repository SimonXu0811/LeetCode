public String licenseKeyFormatting(String S, int K) {
    
    S = S.replaceAll("\\-", "");//删掉掉所有的横线
    S = S.toUpperCase();//在转换之后的字母都要为大写

    StringBuilder sb = new StringBuilder();//创建sb用来修改字符串
    sb.append(S);

    int i=sb.length()-K;//从后向前遍历，每次截取k个长度
    while(i>0) {
        sb.insert(i, '-');//把横线插进字符串
        i -= K;
    }

    return sb.toString();
}

/*
时间复杂度:O(n)
空间复杂度:O(n)
*/
