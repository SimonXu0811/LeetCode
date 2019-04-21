/* The guess API is defined in the parent class GuessGame.
   @param num, your guess
   @return -1 if my number is lower, 1 if my number is higher, otherwise return 0
      int guess(int num); */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int low = 1;
        int high = n;
        while (low <= high) {//改写二分法
            int mid = low + (high - low) / 2;
            int res = guess(mid);
            if (res == 0)//如果是0，那么就是找到了
                return mid;
            else if (res < 0)//猜小了，那么就找大的一半
                high = mid - 1;
            else
                low = mid + 1;//猜大了，就找小的一半
        }
        return -1;
    }
}


/*
时间复杂度:O(logn)
空间复杂度:O(1)
*/
