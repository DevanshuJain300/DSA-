class Solution {
    HashMap<Integer,Integer>dp = new HashMap<>();
    public int rob(int[] nums) {
        return check(nums,0);
    }
    
    public int check(int[] nums, int i){
        if(i>=nums.length){
            return 0;
        }
        if(dp.containsKey(i)){
            return dp.get(i);
        }
        int rob = nums[i]+ check(nums,i+2);
        int skip = check(nums,i+1);

        int ans=Math.max(rob,skip);
        dp.put(i,ans);
        return ans;
    }
}