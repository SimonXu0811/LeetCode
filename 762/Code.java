class Solution {
    int count=0;
    public int countPrimeSetBits(int L, int R) {
        for(int i = L; i <= R; i++){
            int res = Integer.bitCount(i);//数出二进制数中的1的个数
            isPrime(res);//判断是否为素数
        }
        return count;
    }
    
    private void isPrime(int x){
        if(x == 2 || x == 3 || x == 5 || x == 7 ||
                x == 11 || x == 13 || x == 17 || x == 19){//32位中的素数可能性
            count++;
        }
    }
}

/*
时间复杂度:O(1)
空间复杂度:O(1)
*/
