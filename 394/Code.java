public class Solution {
    public String decodeString(String s) {
        String res = "";
        Stack<Integer> countStack = new Stack<>();//保存需要循环的次数
        Stack<String> resStack = new Stack<>(); //保存需要循环的字符串
        int idx = 0;
        while (idx < s.length()) {//遍历整个字符串
            if (Character.isDigit(s.charAt(idx))) {//如果是数字的话，那么就加进次数的stack中
                int count = 0;
                while (Character.isDigit(s.charAt(idx))) {
                    count = 10 * count + (s.charAt(idx) - '0');//防止出现两位数
                    idx++;//继续迭代
                }
                countStack.push(count);
            }
            else if (s.charAt(idx) == '[') {//如果是开始的起点，那么把之前存好的字符串保存到stack中
                resStack.push(res);
                res = "";//重新初始化
                idx++;
            }
            else if (s.charAt(idx) == ']') {//如果是结束的标志，那么把保存的字符串pop出来，然后pop出需要循环的次数，开始循环
                StringBuilder temp = new StringBuilder (resStack.pop());
                int repeatTimes = countStack.pop();
                for (int i = 0; i < repeatTimes; i++) {//循环加起来
                    temp.append(res);
                }
                res = temp.toString();
                idx++;
            }
            else {//否则一个一个字符串加起来
                res += s.charAt(idx++);
            }
        }
        return res;
    }
}

/*
时间复杂度:O(n)
空间复杂度:O(n)
*/
