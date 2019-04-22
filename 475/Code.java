class Solution {
    public int findRadius(int[] houses, int[] heaters) {
		Arrays.sort(heaters);
		
		int result = 0;
		for(int house:houses) {
			int index = Arrays.binarySearch(heaters, house);
			if(index<0) { //index<0,则说明在headers中没有该house,返回 (-(插入点) - 1),第一个大于此键的元素索引  
				index = ~index;
				int dist1 = index - 1 >= 0 ? house - heaters[index - 1] : Integer.MAX_VALUE;//左边的距离
	                        int dist2 = index < heaters.length ? heaters[index] - house : Integer.MAX_VALUE;//右边的距离
 
	                        result = Math.max(result, Math.min(dist1, dist2));//必须用最大值，否则不能覆盖
			}
			//index>=0,则说明在headers中找到了该house, 则说明取暖器位置和house位置重合，该house的最小半径为0,result不变
		}
		return result;
    }
}

/*
时间复杂度:O(nlogn)
空间复杂度:O(1)
*/
