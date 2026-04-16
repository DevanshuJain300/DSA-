class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int maxEnding=0;
        int minEnding=0;
        int result=0;
        for (int i=0;i<nums.length;i++){
            maxEnding=Math.max(maxEnding+nums[i],nums[i]);
            minEnding=Math.min(minEnding+nums[i],nums[i]);
            result=Math.max(result,Math.max(maxEnding,Math.abs(minEnding)));
        }
        return result;
    }
}