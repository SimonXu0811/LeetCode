class Solution1 {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int max = 0;
        int index = 0;
        while(index < prices.length){//遍历所有的索引，找出所有利润
        for(int i = index+1; i < prices.length; i++){
            profit = prices[i] - prices[index];
            if(max < profit){
                max = profit;//计算出最大利润
            }
                
        }

        index++;
    }
        return max;
    }
}

/*
时间复杂度:O(n^2)
空间复杂度:O(n^2)
*/



public class Solution2 {
    public int maxProfit(int prices[]) {
        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minprice)
                minprice = prices[i];//找出数组中的最小值
            else if (prices[i] - minprice > maxprofit)//向后计算看最大利润
                maxprofit = prices[i] - minprice;//记录利润的最大值
        }
        return maxprofit;
    }
}

/*
时间复杂度:O(n)
空间复杂度:O(1)
*/
