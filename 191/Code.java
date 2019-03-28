/*
Time O(n)
Space O(1)
*/
public class Solution1 {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int count = 0;
        String s= Integer.toBinaryString(n);
        for(char c : s.toCharArray()){
            if(c=='1'){
                count++;
            }
        }
        return count;
  }
}


/*
Time O(1)
Space O(1)
*/
public class Solution2 {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
    int sum = 0;
    while (n != 0) {
        sum++;
        n &= (n - 1);
    }
    return sum;
  }
}
