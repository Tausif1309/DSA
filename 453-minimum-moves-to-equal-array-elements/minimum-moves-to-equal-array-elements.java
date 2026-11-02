class Solution {
    public int minMoves(int[] nums) {
        int minVal=Integer.MAX_VALUE;

        for(int i:nums){
            if(i<minVal){
                minVal=i;
            }
        }

        int count=0;
        for(int i=0;i<nums.length;i++){
            count=count+(nums[i]-minVal);
        }

        return count;
    }
}