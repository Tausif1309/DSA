class Solution {
    public boolean detectCapitalUse(String word) {
        int count=0;

        for(char c:word.toCharArray()){
            if(c <= 90){
                count++;
            }
        }

        if(count==0){
            return true;
        }
        else if(count==word.length()){
            return true;
        }
        else if(count==1 && Character.isUpperCase(word.charAt(0))){
            return true;
        }

        return false;
    }
}