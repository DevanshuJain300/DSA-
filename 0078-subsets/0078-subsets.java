class Solution {

    List<List<Integer>> ans=new ArrayList<>();

    public List<List<Integer>> subsets(int[] nums) {
        
        backtrack(nums,0, new ArrayList<>());
        return ans;


    }
    public void backtrack(int[] nums,int index, List<Integer>subList ){
        if(index==nums.length){
            ans.add(new ArrayList<>(subList));
            return;
        }
        //pick
        subList.add(nums[index]);
        backtrack(nums,index+1,subList);
        //remove last
        subList.remove(subList.size()-1);
        //don't pick
        backtrack(nums,index+1,subList);

    }
}
