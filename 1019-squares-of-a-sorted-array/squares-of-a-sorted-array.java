class Solution {
    public int[] sortedSquares(int[] nums) {
        int [] arr=new int [nums.length];
        int l=0;
        int r=nums.length-1;
        for(int i=r;i>=0;i--){
            if(Math.abs(nums[l])<Math.abs(nums[r])){
                arr[i]=nums[r]*nums[r];
                r--;
            }
            else{
                arr[i]=nums[l]*nums[l];
                l++;
            }
        }
        return arr;
    }
}