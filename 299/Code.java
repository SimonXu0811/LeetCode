public class Solution {
    public String getHint(String secret, String guess) {
      int bulls = 0;
	    int cows = 0;
	    int[] numbers = new int[10];
	    for (int i = 0; i < secret.length(); i++) {//遍历字符串
	        if (secret.charAt(i) == guess.charAt(i)) bulls++;//如果位置相同并且字符相同，那么就bulls+1
	        else {
	            if (numbers[secret.charAt(i)-'0']++ < 0) cows++;//如果guess中出现过了，那么就会是小于0，因为guess中出现一次就-1
	            if (numbers[guess.charAt(i)-'0']-- > 0) cows++;//secret是+1，所以判断是不是大于0
	        }
	    }
	    return bulls + "A" + cows + "B";
    }
}

/*
时间复杂度:O(n)
空间复杂度:O(1)
*/
