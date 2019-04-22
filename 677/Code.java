class MapSum {
    HashMap<String, Integer> map;
    public MapSum() {
        map = new HashMap<>();
    }
    public void insert(String key, int val) {
        map.put(key, val);
    }
    public int sum(String prefix) {
        int ans = 0;
        for (String key: map.keySet()) {//遍历整个map，如果起始是prefix，那么就加上key
            if (key.indexOf(prefix) == 0) {
                ans += map.get(key);
            }
        }
        return ans;
    }
}

/**
 * Your MapSum object will be instantiated and called as such:
 * MapSum obj = new MapSum();
 * obj.insert(key,val);
 * int param_2 = obj.sum(prefix);
 */
 
 /*
 时间复杂度:O(n^2)
 空间复杂度:O(1)
 */
