class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0) return new ArrayList();
        Map<String, List> ans = new HashMap<String, List>();//key为拍好序的字符串，value为数组
        for (String s : strs) {//遍历整个字符串，然后按字典顺序排序
            char[] ca = s.toCharArray();
            Arrays.sort(ca);
            String key = String.valueOf(ca);
            if (!ans.containsKey(key)) ans.put(key, new ArrayList());//如果不存在，map中，那么就保存进map，做为新的key
            ans.get(key).add(s);//否则就加进对应的数组中
        }
        return new ArrayList(ans.values());
    }
}

/*
时间复杂度:O(knlogn)
空间复杂度:O(kn)
*/
