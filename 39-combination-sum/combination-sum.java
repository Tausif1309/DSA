class Solution {

    private void findCombination(int indx, int [] candidates,int target, List<List<Integer>> ans,
    List<Integer> curr){
        if(indx==candidates.length){
            if(target==0){
                ans.add(new ArrayList<>(curr));
            }
            return;
        }

        if(candidates[indx]<=target){
            curr.add(candidates[indx]);

            findCombination(indx,candidates,target-candidates[indx],ans,curr);

            curr.remove(curr.size() -1);
        }

        findCombination(indx+1,candidates,target,ans,curr);

    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();

        findCombination(0,candidates,target,ans,new ArrayList<>());

        return ans;
    }
}