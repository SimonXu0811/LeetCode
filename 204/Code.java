public class Solution {
    public int countPrimes(int n) {
        boolean[] notPrime = new boolean[n];//所有的下标都是小于n的
        int count = 0;
        for (int i = 2; i < n; i++) {//遍历整个数组，0，1肯定不是质数
            if (notPrime[i] == false) {//质数的位置保留false
                count++;
                for (int j = 2; j*i < n; j++) {//乘上其他的数，这样公因数肯定不是1和本身，肯定是非质数
                    notPrime[i*j] = true;
                }
            }
        }
        return count;
    }
}

/*
时间复杂度:O(n^2)
空间复杂度:O(n)
*/
