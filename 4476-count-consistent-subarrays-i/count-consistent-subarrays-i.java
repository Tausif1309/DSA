class Solution {
    public int countConsistent(int[] nums) {
        int count = 0;

        for (int left = 0; left < nums.length; left++) {
            int bitAnd = nums[left];
            int min = nums[left];

            for (int right = left; right < nums.length; right++) {
                bitAnd = bitAnd & nums[right];
                min = Math.min(min, nums[right]);

                if (bitAnd == min) {
                    count++;
                }
            }
        }

        return count;
    }
}