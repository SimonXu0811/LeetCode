class Solution1 {
    public int[] findErrorNums(int[] nums) {
        int[] res = new int[2];//一个容复的元素，一个未出现的元素
        int[] temp = new int[nums.length+1];//用来储存各个数出现的次数
        
        for(int i = 0; i < nums.length; i++){//保存次数
            temp[nums[i]]+=1;
        }
        
        for(int j = 0; j < temp.length; j++){//出现2次就是重复，出现0次就是缺失
            if(temp[j] == 0){
                res[1] = j;
            }else if(temp[j] == 2){
                res[0] = j;
            }
        }
        return res;
    }
}

/*
时间复杂度:O(n)
空间复杂度:O(n)
*/


class Solution2 {
    public int[] findErrorNums(int[] nums) {
        int[] result = new int[2];
        HashMap<Integer, Integer> mp = new HashMap<>();
        
        for(int i=0; i<nums.length; i++)
            mp.put(nums[i], mp.getOrDefault(nums[i], 0)+1);//用哈希表如果存在找到该索引，加1，如果不存在，设为默认加1
        
        for(int key=1; key<=nums.length; key++) {
            if(!mp.containsKey(key)) result[1] = key;//如果没有，那么就缺失
            else if(mp.get(key) > 1) result[0] = key;//如果超过一，那么就重复
        }
        return result;
    }
}

/*
时间复杂度:O(n^2)
空间复杂度:O(n)
*/


class Solution3 {
    public int[] findErrorNums(int[] nums) {
        // very similar to first missing postive
        if (nums == null || nums.length == 0) {
            return new int[0];
        }
        int[] res = new int[2];
        for (int i = 0; i < nums.length; i++) {
            while (nums[nums[i] - 1] != nums[i]) {
                swap(nums, nums[i] - 1, i);
            }
        }//先将各个数归位，将重复的元素放置在未出现的索引处
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                res[0] = nums[i];
                res[1] = i + 1;
                break;
            }
        }
        return res;
    }
    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}

/*
时间复杂度:O()
空间复杂度:O(n)
*/


class Solution4 {
    public int[] findErrorNums(int[] nums) {
        int len = nums.length;
        int[] result = new int[2];
        int expectSum = len * (len + 1) / 2;
        int actualSum = 0;
        
        for (int i = 0; i < len; i++) {//遍历如果出现，就将索引上的值乘-1
            int n = Math.abs(nums[i]);
            actualSum += n;
            if (nums[n - 1] < 0) {//如果是负，那么就是已经出现过了
                result[0] = n;
            }
            
            nums[n - 1] *= -1;
        }
        
        result[1] = result[0] + (expectSum - actualSum);//最后计算未出现的
        
        return result;
    }
}

/*
时间复杂度:O(n)
空间复杂度:O(1)
*/

