public class Solution {
  
  public String reverseWords(String s) {
    if (s == null) return null;
    
    char[] a = s.toCharArray();
    int n = a.length;
    
    reverse(a, 0, n - 1);//旋转整个字符串
    reverseWords(a, n);//旋转所有字符
    return cleanSpaces(a, n);//清空空格
  }
  
  void reverseWords(char[] a, int n) {
    int i = 0, j = 0;
      
    while (i < n) {
      while (i < j || i < n && a[i] == ' ') i++; //跳过空格不动
      while (j < i || j < n && a[j] != ' ') j++; //保留非空格的
      reverse(a, i, j - 1);                      //旋转整个字符
    }
  }
  
  String cleanSpaces(char[] a, int n) {//晴空多余的空格
    int i = 0, j = 0;
      
    while (j < n) {
      while (j < n && a[j] == ' ') j++;             
      while (j < n && a[j] != ' ') a[i++] = a[j++]; 
      while (j < n && a[j] == ' ') j++;             //跳过空格
      if (j < n) a[i++] = ' ';                      //只留下一个空格
    }
  
    return new String(a).substring(0, i);//去掉末尾空格
  }
  
  // reverse a[] from a[i] to a[j]
  private void reverse(char[] a, int i, int j) {
    while (i < j) {//旋转整个单词
      char t = a[i];
      a[i++] = a[j];
      a[j--] = t;
    }
  }
  
}

/*
时间复杂度:O(n)
空间复杂度:O(n)
*/
