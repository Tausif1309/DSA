class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            int count = map.getOrDefault(num, 0);

            if (count == 1) {
                return true;
            }
            
            map.put(num, count + 1);
        }
        return false;
    }
}