class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> que = new PriorityQueue<>();//用来生成最小堆
        for(int i = 0; i < matrix.length; i++){//生成一个最小堆
            for(int j = 0; j < matrix[0].length; j++){
                que.add(matrix[i][j]);
            }
        }
        
        int count = 0;
        while(count ++ != k - 1 ) {//然后poll到目标的倒数第二个
        	que.poll();
        }
        
        return que.poll();//然后最后一个poll出来就是答案
    }
}

/*
时间复杂度:O(n)
空间复杂度:O(n)
*/
