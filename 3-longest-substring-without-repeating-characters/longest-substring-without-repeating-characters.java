class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] arr = new int[256];
        int left = 0;
        int right = 0;
        int n = s.length();
        int maxlength = 0;

        while (right < n) {
            if (arr[s.charAt(right)] != 0) {
                if (arr[s.charAt(right)] > left) {
                    left = arr[s.charAt(right)];
                }
            }

            int length = right - left + 1;
            maxlength = Math.max(maxlength, length);

            arr[s.charAt(right)] = right + 1;
            right++;
        }

        return maxlength;
    }
}
