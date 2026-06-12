class Solution {
    public int removeDuplicates(int[] nums) {
        int l=0;
        int r=1;
        int k=1;

        while(r<nums.length){
            if(nums[r]==nums[l]){
                r++;
            }  
            else{
                nums[k]=nums[r];
                l=k;
                k++;
                r++;
            }
                
            
        }
        return k;
    }
}