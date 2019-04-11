public class Solution {
public int ladderLength(String beginWord, String endWord, List<String> wordL) {
    Set<String> wordList = new HashSet<>(wordL);//检测是否endWord一开始就包含在wordL中
    if(wordList.add(endWord)){
        return 0;
    }
    Queue<String> queue = new LinkedList<String>();//保存检测过的元素
    queue.add(beginWord);//从头开始
    int level = 0;
    while(!queue.isEmpty()){
        int size = queue.size();
        for(int i = 0; i < size; i++){//加入一个元素就检查一个元素
            String cur = queue.remove();//先进先出，都是考虑先加的，因为循环之后队列中会出现三个元素
            if(cur.equals(endWord)){ return level + 1;}//如果匹配到了，就说明结束了，那么就返回答案
            for(int j = 0; j < cur.length(); j++){//开始遍历所有的字符，每个都从a到z进行替换
                char[] word = cur.toCharArray();
                for(char ch = 'a'; ch < 'z'; ch++){
                    word[j] = ch;
                    String check = new String(word);//为了查看是否wordL中有相同的元素
                    if(!check.equals(cur) && wordList.contains(check)){//如果不等于本身并且原数组中存在了，那就加进去并且步骤加一
                        queue.add(check);
                        wordList.remove(check);
                    }
                }
            }
        }
        level++;
    }
    return 0;
}
}

/*
时间复杂度:O(26^n)
空间复杂度:O(n)
*/
