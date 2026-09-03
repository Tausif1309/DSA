class Solution {
    public int smallestDivisor(int[] nums, int threshold) {

        int low=1;
        int high=Integer.MIN_VALUE;
        for(int num:nums){
            high=Math.max(high,num);

        }

        while(low<=high){
            int mid=low+(high-low)/2;

            if(middledivisor(nums,mid,threshold)){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }


    private boolean middledivisor(int[] nums,int mid,int threshold){
        long sum=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+(long)Math.ceil((double)nums[i]/mid);
            if(sum>threshold){
                return false;
            }

        }
        return true;
    }
}