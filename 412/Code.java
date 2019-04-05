class Solution {
    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();//返回的类型
        for(int i = 1; i <= n ; i++){
            if(i%3 == 0 && i%5 != 0){//能被3整除，不能被5整除，Fizz
                list.add("Fizz");
                continue;
            }else if(i%3 !=0 && i%5 == 0){//能被5整除，不能被3整除，Buzz
                list.add("Buzz");
                continue;
            }else if(i%3 == 0 && i%5 == 0){//能被5和3都整除，FizzBuzz
                list.add("FizzBuzz");
                continue;
            }
            list.add(""+i);//都不行，那就是原数字
        }
        return list;
    }
}

/*
时间复杂度:O(n)
空间复杂度:O(1)
*/
