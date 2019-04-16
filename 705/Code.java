class MyHashSet {

    private int buckets = 1000;
    private int itemsPerBucket = 1001;
    private boolean[][] table;
    
    /** Initialize your data structure here. */
    public MyHashSet() {
        table = new boolean[buckets][];
    }

    public int hash(int key) {//计算hash值
        return key % buckets;
    }

    public int pos(int key) {//计算插入的位置，代替了链表
        return key / buckets;
    }
    
    public void add(int key) {//插入对应的hash值和数值，然后设为true
        int hashkey = hash(key);
        
        if (table[hashkey] == null) {
            table[hashkey] = new boolean[itemsPerBucket];
        }
        table[hashkey][pos(key)] = true;
    }
    
    public void remove(int key) {//找到直接设为false
        int hashkey = hash(key);

        if (table[hashkey] != null)
            table[hashkey][pos(key)] = false;
    }
    
    /** Returns true if this set did not already contain the specified element */
    public boolean contains(int key) {//直接返回改位置的数组的值
        int hashkey = hash(key);
        return table[hashkey] != null && table[hashkey][pos(key)];
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
 
 /*
 时间复杂度:O(1)
 空间复杂度:O(n)
 */
