class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();//用来保存最终的结果
        
        for(String s : emails){
            String local = s.substring(0,s.indexOf("@"));//从@开始分开考虑
            String address = s.substring(s.indexOf("@"));
            
            if(local.contains("+")){//如果有+号那么加号后面的去掉
                local = local.substring(0,local.indexOf("+"));
            }
            
            local = local.replaceAll("\\.","");//忽略.号
            set.add(local+address);
        }
        return set.size();
    }
}

/*
时间复杂度:O(n)
空间复杂度:O(n)
*/
