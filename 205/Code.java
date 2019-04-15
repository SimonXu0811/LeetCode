public class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s == null || s.length() <= 1) return true;
        HashMap<Character, Character> map = new HashMap<Character, Character>();
        for(int i = 0 ; i< s.length(); i++){//遍历整个字符串，比较
            char a = s.charAt(i);
            char b = t.charAt(i);
            if(map.containsKey(a)){//如果重复出现字符了，就取出value，和t中同索引的字符比较
                 if(map.get(a).equals(b))//如果满足了就继续向后
                continue;
                else
                return false;
            }else{//如果没有加过，那么就是这个key-value对没有出现过，就加入这个key-value对
                if(!map.containsValue(b))
                map.put(a,b);
                else return false;
                
            }
        }
        return true;
        
    }
}

/*
时间复杂度:O(n^2)
空间复杂度:O(n)
*/
