class Solution {
    public long countCommas(long n) {
        long count=0;
        
        for(long num=1000; num<=n; num=num*1000){
            count=count + n-num+1;
        }
        return count;
        
    }
}