public class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        HashMap <String, Integer> map = new HashMap <> ();
        for (int i = 0; i < list1.length; i++)//将list1中的元素保存到map中，其中元素是key，索引是value
            map.put(list1[i], i);
        List <String> res = new ArrayList <> ();
        int min = Integer.MAX_VALUE, sum;
        for (int j = 0; j < list2.length && j <= min; j++) {//然后遍历整个数组，如果存在于map中，那么就获取索引和
            if (map.containsKey(list2[j])) {
                sum = j + map.get(list2[j]);
                if (sum < min) {//如果有更小的值，那么就清空数组，加入新的最小的元素
                    res.clear();
                    res.add(list2[j]);
                    min = sum;
                } else if (sum == min)//如果索引和相等的元素不止一个，那么就加进list中
                    res.add(list2[j]);
            }
        }
        return res.toArray(new String[res.size()]);
    }
}

/*
时间复杂度:O(n)
空间复杂度:O(n)
*/
