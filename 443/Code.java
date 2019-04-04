class Solution {
    public int compress(char[] chars) {
        int node = 0, res = 0;//两个指针，一个用来保存char，一个用来保存新的地址
        for (int index = 0; index < chars.length; index++) {//遍历数组
            if (index + 1 == chars.length || chars[index + 1] != chars[index]) {//一直到倒数第二个或者说后一个是不同的元素
                chars[res++] = chars[node];//将char储存进新地址
                if (index > node) {//如果长度超过1
                    for (char c: ("" + (read - node + 1)).toCharArray()) {//将count加进数组里，一个地址只存一位数字
                        chars[write++] = c;
                    }
                }
                node = index + 1;//将node指向新的char
            }
        }
        return res;
    }
}

/*
时间复杂度:O(n)
空间复杂度:O(1)
*/
