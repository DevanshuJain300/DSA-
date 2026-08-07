class Solution {
    List<List<Integer>> res=new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
    backtrack(nums,new ArrayList<>());
    return res;      
    }

    public void backtrack(int[] nums,List<Integer> subList ){
        if(subList.size()==nums.length){
            res.add(new ArrayList<>(subList));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(subList.contains(nums[i])){
                continue;
            }
            else{
                subList.add(nums[i]);
                backtrack(nums,subList);

                subList.remove(subList.size()-1);
            }
        }
    }
}