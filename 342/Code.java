/*
Time O(n)
Space O(1)
*/
class Solution1 {
    public boolean isPowerOfFour(int num) {
        if(num<1) return false;
        while(num%4==0){
            num/=4;
        }
        return num==1;
    }
}


/*
Time O(1)
Space O(1)
*/
class Solution2 {
    public boolean isPowerOfFour(int num) {
        for(int i = 0; i < 31; i+= 2) {
            if((num ^ (1 << i)) == 0)
                return true;
        }
        return false;
    }
}
