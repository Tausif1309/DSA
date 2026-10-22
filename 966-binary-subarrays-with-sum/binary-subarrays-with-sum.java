class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return subSum(nums,goal)-subSum(nums,goal-1);
}


private static int subSum(int [] nums,int goal){
    int right=0;
    int left=0;
    int sum=0;
    int count=0;

    if(goal<0){
        return 0;
    }
    while(right<nums.length){
        sum=sum+nums[right];

        while(sum>goal){
            sum=sum-nums[left];
            left++;
        }

        count =count+right-left+1;
        right++;
    }
    return count;
    }
}