class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0, right = 0;
        int zeros = 0, maxLen = 0;
        while (right < nums.length) {
            if (nums[right] == 0) {
                zeros++;
            }
            if (zeros > k) {
                if (nums[left] == 0) {
                    zeros--;
                }
                left++;
            }

            if (zeros <= k) {
                int len = right - left + 1;
                maxLen = Math.max(maxLen, len);
            }

            right++;
        }
        
        return maxLen;
    }
}