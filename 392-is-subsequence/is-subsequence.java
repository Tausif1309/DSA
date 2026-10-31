class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()==0){
            return true;
        }
        int count=0;
        if(s.length()>t.length()){
            return false;
        }

        int left=0;
        for(int i=0;i<t.length();i++){
            if(left==s.length()){
                return true;
            }
            if(s.charAt(left)==t.charAt(i)){
                count++;
                left++;
            }

        }
        if(count==s.length()){
            return true;
        }
        return false;
    }
}