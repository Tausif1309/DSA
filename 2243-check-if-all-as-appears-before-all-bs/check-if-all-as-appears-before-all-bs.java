class Solution {
    public boolean checkString(String s) {
     boolean valid=true;

    for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='b'){
            valid=false;
        }

            if(!valid && s.charAt(i)=='a'){
            return false;
            }
        }   
    return true;
    }
}