class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        int max = 0;
        String res = "";//对应的最大值的key，和value
        
        String[] s = paragraph.replaceAll("\\W+" , ",").toLowerCase().split("\\,");//去掉非字母项，转成小写，分割字符串
        HashSet<String> set = new HashSet<>(Arrays.asList(banned));//加进set中为了避免出现banned字符
        HashMap<String,Integer> count = new HashMap<>();//map它、用来计数
        
        for(String str : s){
            if(str.length() > 0){
            if(!set.contains(str)){//避免了banned字符
                count.put(str,count.getOrDefault(str,0) + 1);//如果出现过了，那么就在value处+1而不是创建一个新的链表覆盖
                if(count.get(str) > max){//找到一个最大值
                max = count.get(str);
                res = str;
            }
            }
            }
        }
        return res;
    }
}

/*
时间复杂度:O(m+n)
空间复杂度:O(m+n)
*/
