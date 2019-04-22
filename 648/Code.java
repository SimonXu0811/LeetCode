class Solution {
    public String replaceWords(List<String> dict, String sentence) {

        Set<String> set = new HashSet<>(dict);
        StringBuilder sb = new StringBuilder();
        String[] word = sentence.split(" ");//转换成数组形式遍历
        for(int i = 0;i<word.length;i++) {//先遍历每一个单词
            for (int j = 1; j <= word[i].length(); j++) {//取单词的相同长度，找是否存在，如果存在，那么就就替换
                if (set.contains(word[i].substring(0, j)))
                    word[i] = word[i].substring(0, j);
            }
            sb.append(word[i] +" ");
        }
        return sb.substring(0,sb.length()-1);

    }
}

/*
时间复杂度:O(n^3)
空间复杂度:O(1)
*/
