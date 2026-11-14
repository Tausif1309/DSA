class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int [] prefix=new int[nums.size()+1];

        for(int i=0;i<nums.size();i++){
            prefix[i+1]=prefix[i]+nums.get(i);
        }

        int ans=Integer.MAX_VALUE;

        for(int i=0;i<nums.size();i++){

            for(int length=l;length<=r;length++){
                int j=i+length;

                if(j>nums.size()){
                    break;
                }

                int sum=prefix[j]-prefix[i];
                if(sum>0){
                    ans=Math.min(ans,sum);
                }
            }
        }

        if(ans==Integer.MAX_VALUE){
            return -1;
        }
        return ans;
    }
}