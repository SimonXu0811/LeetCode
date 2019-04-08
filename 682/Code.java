class Solution {
    Stack<Integer> stack = new Stack<>();
    public int calPoints(String[] ops) {
        int sum = 0;
        for(String s : ops){//遍历数字
            if(s.equals("C")){//如果是C的话，那就pop掉
                if(!stack.isEmpty()) stack.pop();
            }else if(s.equals("D")){//如果是D的话就是最顶层的数乘2然后加进stack中
                stack.push(stack.peek()*2);
            }else if(s.equals("+")){//如果是+，那就是提出两个数，然后相加，把三个一起放回，但是注意后进先出原则
                int x = stack.pop();
                int y =stack.pop();
                int z = x + y;
                stack.push(y);
                stack.push(x);
                stack.push(z);
            }else{
                stack.push(Integer.valueOf(s));//最后是数字，就直接加进去
            }
        }
        while(!stack.isEmpty()){
            sum += stack.pop();//最后把数字全加起来
        }
        return sum;
    }
}

/*
时间复杂度:O(n)
空间复杂度:O(n)
*/
