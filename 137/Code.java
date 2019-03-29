class Solution1 
{
    public int singleNumber(int[] A)
    {
        Map<Integer, Integer> map = new HashMap<>();
        int result = 0;
        
        for(int n : A)
        {
            map.put(n, map.getOrDefault(n, 0) + 1);//将数组的值为哈希索引，记录次数
        }
        
        for(int n : A)
        {
            if(map.get(n) == 1)//只出现一次
                return n;
        }
        return -1;
    }
}

/*
时间复杂度:O(n)
空间复杂度:O(n)
*/


class Solution2 
{
	public int singleNumber(int[] A)
	{
		int ones = 0, twos = 0;//两个bit判断重复以及归位
		
		for(int n : A)
		{
			ones = (ones ^ n) & ~twos;
			twos = (twos ^ n) & ~ones;
		}
		return ones;
	}
}

/*
时间复杂度:O(n)
空间复杂度:O(1)
*/



