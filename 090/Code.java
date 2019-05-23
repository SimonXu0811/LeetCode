public class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        dfs(nums, 0, new ArrayList<Integer>());
        return res;
    }
    
    public void dfs(int[] nums,int index,List<Integer> path){
        res.add(path);
        for(int i=index; i<nums.length; i++){
            if(i > index&&nums[i]==nums[i - 1]) continue;//如果遇到重复的就向后移动，创建新的记录，旧的依旧保存
            List<Integer> nPath= new ArrayList<>(path);
            nPath.add(nums[i]);
            dfs(nums, i + 1, nPath);
        }
    }
}

/*
时间复杂度:O(n)
空间复杂度:O(n)
*/
