class Solution1 {
    public int hammingDistance(int x, int y) {
        int res = x^y;//异或的作用就是取出两个数不同的
        int count=0;
        while(res != 0){
            if((res & 1)==1){//将最后一位与1比较，相同就记一次
                count ++;
            }
                res = res>>1;//右移直到0为止
        }
        return count;
    }
}

class Solution2{
public int hammingDistance(int x, int y) {
        int num = 0;
		for (int i = 0; i < 32; i ++) {
			int tmp1 = x >>> i;//开始每一位向右无限移动
			int tmp2 = y >>> i;
			if ((tmp1 & 1) != (tmp2 & 1)) {//一个为0一个为1
				num += 1;
			}
		}
		return num;
    }
}

class Solution3{
public int hammingDistance(int x, int y) {
    return Integer.bitCount(x^y);
}
}
