class Solution {
    public int numberOfSubstrings(String s) {
        int [] chars={-1,-1,-1};
        int count=0;

        for(int i=0;i<s.length();i++){
            chars[s.charAt(i)-'a']=i;

            if(chars[0]!=-1 && chars[1] !=-1 && chars[2] != -1){
                count=count+(1+Math.min(Math.min(chars[0],chars[1]), chars[2]));
            }
        }
        return count;
        
    }
}