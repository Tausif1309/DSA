class Solution {
    public boolean validPalindrome(String s) {
        int left=0;
        int right=s.length()-1;

        while(left<right){
            if(s.charAt(left) == s.charAt(right)){
                left++;
                right--;
            }
            else {
                return palindromeCheck(s,left+1,right) || palindromeCheck(s,left,right-1);
            }
        }
        return true;
    }

    private static boolean palindromeCheck(String s,int left,int right){
        while(left<right){
            if(s.charAt(left) == s.charAt(right)){
                left++;
                right--;
            }
            else {
                return false;
            }
        }
        return true;
    }
}