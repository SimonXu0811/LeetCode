public class Solution {
     public String largestNumber(int[] num) {
		if(num == null || num.length == 0)
		    return "";

		String[] s_num = new String[num.length];
		for(int i = 0; i < num.length; i++)//将数字转换成字符串的类型
		    s_num[i] = String.valueOf(num[i]);

		Comparator<String> comp = new Comparator<String>(){//改写compare的方法，如果两个字符以两种顺序相加，如果一方比较大，那么就返回比较大的顺序
		    @Override
		    public int compare(String str1, String str2){
		        String s1 = str1 + str2;
			String s2 = str2 + str1;
			return s2.compareTo(s1); // reverse order here, so we can do append() later
		    }
	        };
		
		Arrays.sort(s_num, comp);//给字符串用compare的顺序排序
                if(s_num[0].charAt(0) == '0')//如果就不能放前面
                    return "0";
            
		StringBuilder sb = new StringBuilder();
		for(String s: s_num)//把字符串顺序输出
	            sb.append(s);
		
		return sb.toString();
		
	}
}

/*
时间复杂度:O(nlogn)
空间复杂度:O(n)
*/
