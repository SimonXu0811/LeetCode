class Solution {
    List<String> solutions = new ArrayList<String>();
    public List<String> restoreIpAddresses(String s) {
    restoreIp(s, 0, "", 0);
    return solutions;
}

private void restoreIp(String ip, int idx, String restored, int count) {
    if (count > 4) return;//结束的标志就是3个点全部用完了
    if (count == 4 && idx == ip.length()) solutions.add(restored);
    
    for (int i=1; i<4; i++) {
        if (idx+i > ip.length()) break;//如果ip的长度小于4的话，那么就不能添加了
        String s = ip.substring(idx,idx+i);
        if ((s.indexOf("0") == 0 && s.length()>1) || (i==3 && Integer.valueOf(s) >= 256)) continue;//然后不断的重复取1-3个数，然后判断如果起始为0，并且长度不为0，或者3为数字超过了256，那么这个就不行
        restoreIp(ip, idx+i, restored+s+(count==3?"" : "."), count+1);//否则继续递归如果count不为3，那么就继续加点，否则就不加
    }
}
}

/*
时间复杂度:O(1)
空间复杂度:O(1)
*/
