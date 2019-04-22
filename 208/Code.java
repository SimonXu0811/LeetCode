class TrieNode {
        // Initialize your data structure here.
        int count = 0;
        TrieNode[] trieNodes = new TrieNode[26];
        Boolean exist = false;
        public TrieNode() {
        }

        public TrieNode(int count, Boolean exist) {
            this.count = count;
            this.exist = exist;
        }

        public int getCount() {
            return count;
        }

        public void setCount(int count) {
            this.count = count;
        }

        public TrieNode[] getTrieNodes() {
            return trieNodes;
        }

        public void setTrieNodes(TrieNode[] trieNodes) {
            this.trieNodes = trieNodes;
        }

        public Boolean getExist() {
            return exist;
        }

        public void setExist(Boolean exist) {
            this.exist = exist;
        }
    }


class Trie {
    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    // Inserts a word into the trie.
    public void insert(String word) {
        TrieNode node = root;
        int length = word.length();
        int position ;
        char c;
        for (int i = 0; i < length; i++) {
            c = word.charAt(i);
            position = c-'a';
            if (node.trieNodes[position] == null) {
                node.trieNodes[position] = new TrieNode();
            }
            node = node.trieNodes[position];
            node.setCount(node.getCount()+1);
        }
        node.setExist(true);
    }

    // Returns if the word is in the trie.
    public boolean search(String word) {
        boolean result = false;
        TrieNode node = root;
        int length = word.length();
        int position ;
        char c;
        for (int i = 0; i < length; i++) {
            c = word.charAt(i);
            position = c - 'a';
            node = node.trieNodes[position];
            if (node == null) {
                break;
            }
        }
        if (node != null && node.getExist()) {
            result = true;
        }
        return result;
    }

    // Returns if there is any word in the trie
    // that starts with the given prefix.
    public boolean startsWith(String prefix) {
        TrieNode node = root;
        int length = prefix.length();
        int position ;
        char c;
        for (int i = 0; i < length; i++) {
            c = prefix.charAt(i);
            position = c - 'a';
            node = node.trieNodes[position];
            if (node == null) {
                return false;
            }
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
 
 /*
 时间复杂度:O(k)
 空间复杂度:O(k)
 */
