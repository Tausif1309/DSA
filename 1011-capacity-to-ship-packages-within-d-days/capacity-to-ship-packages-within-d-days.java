class Solution {
    public int shipWithinDays(int[] weights, int days) {

        int low=maxNum(weights);
        int high=sum(weights);

        while(low<=high){
            int mid=low+(high-low)/2;
            int reqdays=capacity(weights,mid);
            if(reqdays<=days){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
        
    }

    private int capacity(int [] weights,int mid){
        int day=1;
        int total=0;

        for(int i=0;i<weights.length;i++){
            if(total+weights[i]>mid){
                day=day+1;
                total=weights[i];
            }
            else{
                total=total+weights[i];
            }
        }
        return day;
    }

    private int maxNum(int [] weights){
        int max=Integer.MIN_VALUE;
        for(int num:weights){

            max=Math.max(num,max);
        }
        return max;
    }

    private int sum(int [] weights){
        int sum=0;
        for(int nums:weights){
            sum=sum+nums;
        }
        return sum;
    }
}