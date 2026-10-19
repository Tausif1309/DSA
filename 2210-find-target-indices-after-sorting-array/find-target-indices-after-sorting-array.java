class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int numCount=0;
        int targetCount=0;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]<target){
                numCount++;
            }
            else if(nums[i] == target){
                targetCount++;

            }
        }
        
        List<Integer> list=new ArrayList<>();
        while(targetCount>0){
            list.add(numCount++);
            targetCount--;
        }
        return list;
    }
}