class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> count = new HashMap<Character, Integer>();//key是出现的字符，value是出现的次数
        int n = s.length();
        for (int i = 0; i < n; i++) {//遍历整个字符串，如果出现一次就加一次
            char c = s.charAt(i);
            count.put(c, count.getOrDefault(c, 0) + 1);
        }
        
        // find the index
        for (int i = 0; i < n; i++) {//找到第一个只出现一次的元素
            if (count.get(s.charAt(i)) == 1) 
                return i;
        }
        return -1;
    }
}

/*
时间复杂度:O(n)
空间复杂度:O(n)
*/
