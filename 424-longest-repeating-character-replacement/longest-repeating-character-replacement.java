class Solution {
    public int characterReplacement(String s, int k) {
        if(s.length()==k){
            return s.length();
        }

        int [] hasharr=new int[26];

        int left =0;
        int right=0;
        int maxLength=0;
        int maxfreq=0;
        
        while(right<s.length()){
            hasharr[s.charAt(right)-'A']++;
            maxfreq=Math.max(maxfreq,hasharr[s.charAt(right)-'A']);
            if((right-left+1)-maxfreq >k){
                hasharr[s.charAt(left)-'A']--;
                left++;
            }

            if((right-left+1)-maxfreq <=k){
                maxLength=Math.max(maxLength,right-left+1);
            }
            right++;
        }

        return maxLength;

        
    }
}