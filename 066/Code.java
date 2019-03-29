class Solution1 {
    public int[] plusOne(int[] digits) {
        int carry = 1;
        int last = digits.length-1;
        int[] answer = new int[digits.length+1];//这个数组防止第一个有进位
        for(int i = last; i >= 0; i--){
            digits[i] += carry;
            if(digits[i] == 10){
                digits[i] = 0;
                carry = 1;
            }//有进为就带carry
            else{
                carry = 0;
            }
        }
        if(carry == 1){
            answer[0] = carry;
            for(int i = 0; i < digits.length; i++){
                answer[i+1] = digits[i];
            }//如果第一个有进位就多加一个
            return answer;
        }
        return digits;
    }
}

/*
时间复杂度:O(n)
空间复杂度:O(n)
*/
