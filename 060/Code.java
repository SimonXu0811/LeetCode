class Solution {
    public String getPermutation(int n, int k) {
        int pos = 0;
        List<Integer> numbers = new ArrayList<>();
        int[] factorial = new int[n+1];//用来保存所有的组合和
        StringBuilder sb = new StringBuilder();//记录答案
        int sum = 1;
        factorial[0] = 1;
        for(int i=1; i<=n; i++){//计算出所有的组合
            sum *= i;
            factorial[i] = sum;
        }
        for(int i=1; i<=n; i++){//列出所有的值
            numbers.add(i);
        }
        k--;//索引，所以要减一
    
        for(int i = 1; i <= n; i++){
            int index = k/factorial[n-i];//按公式计算找数
            sb.append(String.valueOf(numbers.get(index)));
            numbers.remove(index);//以防重复
            k-=index*factorial[n-i];//下一步的k
        }
    return String.valueOf(sb);
    }
}

/*
时间复杂度:O(n)
空间复杂度:O(n)
*/
