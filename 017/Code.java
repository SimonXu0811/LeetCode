class Solution {
  Map<String, String> phone = new HashMap<String, String>() {{//首先创建数字和字符串对应表
    put("2", "abc");
    put("3", "def");
    put("4", "ghi");
    put("5", "jkl");
    put("6", "mno");
    put("7", "pqrs");
    put("8", "tuv");
    put("9", "wxyz");
  }};

  List<String> output = new ArrayList<String>();

  public void backtrack(String combination, String next_digits) {
    if (next_digits.length() == 0) {//回溯的终点就是没有其他的字符了
      output.add(combination);
    }
    
      String digit = next_digits.substring(0, 1);//获取数字的第一个
      String letters = phone.get(digit);//从表中得到对应的字符串
      for (int i = 0; i < letters.length(); i++) {//然后遍历每个字符，每获取一个都要再递归一次
        String letter = phone.get(digit).substring(i, i + 1);//获取不同的字符
        backtrack(combination + letter, next_digits.substring(1));//加进字符串中，然后后面的递归后面的一个字符
      }
  }

  public List<String> letterCombinations(String digits) {
    if (digits.length() != 0)
      backtrack("", digits);
    return output;
  }
}

/*
时间复杂度:O(3^N*4^M)
空间复杂度:O(3^N*4^M)
*/
