/*
Time O(1)
Space O(1)
*/
class Solution1{
    private int countOneBits(int v) {
        int res = 0;
        while (v > 0) {
            res += v & 1;
            v >>= 1;
        }
        return res;
    }
    
    public List<String> readBinaryWatch(int num) {
        List<String> result = new ArrayList<>();
        for (int h = 0; h < 12; h++) {
            for (int m = 0; m < 60; m++) {
            //将小时和分钟全部用2进制表示出来，然后组合判断是否满足num的个数
                if (countOneBits(h) + countOneBits(m) == num) {
                    result.add(h + ":" + (m < 10 ? "0" : "") + m);
                }
            }
        }
        return result;
    }
 }
 
 
 /*
 Time O(1)
 SpaceO(1)
 */
 class Solution2 {

		private List<String> res = new ArrayList<>();
    
		public List<String> readBinaryWatch(int num) {
			dfs(0,0,num,0);
			return res;
		}
		private void dfs(int time,int pos,int num,int index){
			if(pos == num) {
				handle(time);
				return;
			}
			for (int i = index;i < 10;i++){
                if((time & 1 << i) == 0){
                	dfs(time | 1 << i,pos+1,num,i);
                }
			}
		}
		private void handle(int time){
			// 计算小时
			final int hour = time >> 6;
			if(hour > 11){
				return;
			}
			// 将低8位置0,再异或
			final int minute = time & 960 ^ time;
			if(minute > 59){
				return;
			}
            res.add(hour+":"+(minute > 9 ? minute : "0"+minute));
		}
	}
