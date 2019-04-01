public void moveZeroes(int[] nums) {
        int p1=0,p2=p1+1,len=nums.length;
        while(p1<len&&p2<len){
            if(nums[p1]!=0){
                p1++;
            }//找第一个零元素
            else if(nums[p2]!=0){//找第二个非零元素
                nums[p1++]=nums[p2];//复制给第一个指针
                nums[p2]=0;//第二个归零
            }
            p2++;
        }
    }
    
/*
时间复杂度:O(n)
空间复杂度:O(1)
*/
