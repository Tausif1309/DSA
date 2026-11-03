class Solution {
    public int minMoves(int[] nums) {
        int count=0;
        int max=Integer.MIN_VALUE;

        for(int i:nums){
            max=Math.max(max,i);
        }

        for(int i:nums){
            count=count+(max-i);
        }
        return count;
    }
}