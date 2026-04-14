class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum=nums[0];
        int bestEnding=nums[0];
        for(int i=1;i<nums.length;i++){
            int x=bestEnding+nums[i];
            int y=nums[i];
            bestEnding=Math.max(x,y);
            maxSum=Math.max(maxSum,bestEnding);
        }
        return maxSum;

    }
}