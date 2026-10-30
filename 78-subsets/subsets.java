class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        ArrayList<Integer> current=new ArrayList<>();

        ansSet(0,list,current,nums,nums.length);
        
        return list;


    }

    private static void ansSet(int indx, List<List<Integer>> list,
    ArrayList<Integer> current, int[] nums, int n){

        if(indx==n){
            list.add(new ArrayList<>(current));
            return ;
        }

        ansSet(indx+1,list,current,nums,n);

        current.add(nums[indx]);

        ansSet(indx+1,list,current,nums,n);

        current.remove(current.size()-1);
    }

}