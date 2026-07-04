class Solution {
    public int removeDuplicates(int[] nums) {
       int k=0,l=1;
       while(l<nums.length){
        if(nums[k]==nums[l]){
            l++;
        }
      else{  k++;
        nums[k]=nums[l];
        l++;}
       }
       return k+1;
    }
}