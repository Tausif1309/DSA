class Solution {
    public int thirdMax(int[] nums) {
        
        long highest = Long.MIN_VALUE;
        long second = Long.MIN_VALUE;
        long third = Long.MIN_VALUE;

        for (int num : nums) {

            if (num > highest) {
                third = second;
                second = highest;
                highest = num;
            }
            else if (num > second && num != highest) {
                third = second;
                second = num;
            }
            else if (num > third && num != second && num != highest) {
                third = num;
            }
        }

        if (third == Long.MIN_VALUE) {
            return (int) highest;
        }

        return (int) third;
    }
}