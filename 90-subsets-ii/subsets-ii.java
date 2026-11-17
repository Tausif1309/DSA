class Solution {

    private static void subSet(int indx,List<Integer> ds,List<List<Integer>> ansList,int [] nums){
        ansList.add(new ArrayList<>(ds));

        for(int i=indx;i<nums.length;i++){
            if(i!=indx && nums[i]==nums[i-1]){
                continue;
            }

            ds.add(nums[i]);
            subSet(i+1,ds,ansList,nums);

            ds.remove(ds.size()-1);
        }
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ansList=new ArrayList<>();
        subSet(0,new ArrayList<>(),ansList,nums);
        return ansList;
    }
}