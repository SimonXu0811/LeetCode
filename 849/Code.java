class Solution {
    public int maxDistToClosest(int[] seats) {
        int N = seats.length;
        int prev = -1, future = 0;
        int ans = 0;

        for (int i = 0; i < N; ++i) {//开始遍历全数组
            if (seats[i] == 1) {//找到左边的1
                prev = i;
            } else {
                while (future < N && seats[future] == 0 || future < i)
                    future++;//同时找右边的1

                int left = prev == -1 ? N : i - prev;//然后计算与左边1的差值
                int right = future == N ? N : future - i;//计算与右边1的差值
                ans = Math.max(ans, Math.min(left, right));
            }
        }

        return ans;
    }
}

/*
时间复杂度:O(n)
空间复杂度:O(1)
*/
