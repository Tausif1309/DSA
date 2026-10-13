class Solution {
    public int maxPower(String s) {
        int maxLength=1;
        int n=s.length();
        int length=1;

        for(int i=1;i<n;i++){
            if(s.charAt(i)==s.charAt(i-1)){
                length++;
                maxLength=Math.max(maxLength,length);
            }
            else {
                length=1;
            }
        }
        return maxLength;
    }
}