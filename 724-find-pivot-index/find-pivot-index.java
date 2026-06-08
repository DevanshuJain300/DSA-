class Solution {
    public int pivotIndex(int[] nums) {
       int sum=0;
       int leftSum=0;
       int rightSum=0;
       int n=nums.length;
       for(int i=0;i<n;i++){
        sum=sum+nums[i];
       }
       for(int i=0;i<n;i++){
        rightSum=sum-leftSum-nums[i];
        if(rightSum==leftSum){
            return i;
        }
        leftSum=leftSum+nums[i];
       }
       return -1;
    }
}