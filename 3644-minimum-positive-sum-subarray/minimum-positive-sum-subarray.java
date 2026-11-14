class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        
        int ans=Integer.MAX_VALUE;

        for(int i=0;i<nums.size();i++){
            int sum=0;
            for(int j=i;j<nums.size();j++){
                int len=j-i+1;

                sum=sum+nums.get(j);

                if(len>=l && len<=r && sum>0){
                    ans=Math.min(ans,sum);   
                }

                if(len>=r){
                    break;
                }
            }
        }
        
        if(ans==Integer.MAX_VALUE){
            return -1;
        }
        
        return ans;

    }
}