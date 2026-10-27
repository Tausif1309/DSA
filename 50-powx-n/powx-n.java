class Solution {
    public double myPow(double x, int n) {
        double ans=1.0;
        long newN=n;

        if(n<0){
            newN= (-1) *newN;
        }

        while(newN > 0){
            if(newN % 2 == 1){
                ans = ans * x;
                newN=newN-1;
            }
            else{
                x= x*x;
                newN=newN/2;
            }
        }

        if(n<0){
            return (double) 1.0 / (double)ans;
        }
        return ans;
    }
}