class Solution {
    public int maxProduct(int[] nums) {
        int maxProd=nums[0];
        int minEnding=nums[0];
        int maxEnding=nums[0];
        for(int i=1;i<nums.length;i++){
            int x=minEnding*nums[i];
            int y=maxEnding*nums[i];
            int z=nums[i];
            maxEnding=Math.max(x,Math.max(y,z));
            minEnding=Math.min(x,Math.min(y,z));
            maxProd=Math.max(maxProd,Math.max(maxEnding,minEnding));
        }
        return maxProd;
    }
}