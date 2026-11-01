class Solution {
    public int minMergedInteger(int[] nums) {
        int ans=Integer.MAX_VALUE;

        for(int i=0;i<nums.length;i+=2){
            int currsum=nums[i];
            int temp=nums[i+1];
            while(temp>0){
                currsum=currsum*10;
                temp=temp/10;
            }
            currsum=currsum+nums[i+1];
            ans=Math.min(ans,currsum);
        }

        return ans;
    }
}