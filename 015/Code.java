 public List<List<Integer>> threeSum(int[] a) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(a);
        
        for(int i = 0; i < a.length; i++) {//先遍历数组，然后假设这个数为一个值，转成两数之和
            if(i > 0 && a[i] == a[i-1]) continue;
            int l = i + 1, h = a.length - 1, target = -a[i];
            while(l < h) {//双指针法，如果加起来大于target，右边减一，小于target，就左边加一
                if(l != i + 1 && a[l] == a[l-1]) l++;
                else {
                    int temp = a[l]+a[h];
                    if(temp == target) {
                        res.add(new ArrayList<>(Arrays.asList(a[i], a[l++], a[h--])));
                    } else if(temp > target) {
                        h--;
                    } else {
                        l++;
                    }
                }
            }
        }
        return res;
    }
    
/*
时间复杂度:O(n^2)
空间复杂度:O(1)
*/
