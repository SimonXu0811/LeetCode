public class Solution {
        public boolean isValid(String s) {
            Stack<Character> stack = new Stack<>();//利用stack中的后进先出原理
            Map<Character, Character> map = new HashMap<>();//map用来保存一对一对的括号
            map.put('(', ')');
            map.put('[', ']');
            map.put('{', '}');
            for(char c : s.toCharArray()) {//迭代遍历整个字符串
                if(map.containsKey(c)) {//如果是开括号就加进去
                    stack.push(c);
                } else {
                    if(!stack.isEmpty() && map.get(stack.peek()) == c) {//如果是闭合括号，那么就去获取value的值
                        stack.pop();//如果一致就可以删除看下一对
                    } else {
                        return false;
                    }
                }
            }
            return stack.isEmpty();//如果都成立，就是true
        }
}

/*
时间复杂度:O(n)
空间复杂度:O(n)
*/
