class Solution {
    public boolean lemonadeChange(int[] bills) {
        if(bills[0] != 5) return false;//一开始不是5肯定找不出
        int count5 = 1;//手里一开始肯定有一张5元
        int count10 = 0;//手里一开始肯定没有10元
        for(int i = 1; i < bills.length; i++){//遍历数组，计算手中的零钱数
            if(bills[i] == 5){//收五元就五元纸币加一
                count5++;
            }else if(bills[i] == 10){
                count5--;
                count10++;
            }else if(bills[i] == 20){
                if(count10 == 0){
                    count5-=3;
                }else{
                    count10--;
                    count5--;
                }
            }
            if(count5 < 0 || count10 < 0){//一个不符合就false
                return false;
            }
            
        }
        return true;
    }
}

/*
时间复杂度:O(n)
空间复杂度:O(1)
*/
