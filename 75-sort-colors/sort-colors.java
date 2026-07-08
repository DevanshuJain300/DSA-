class Solution {
    public void sortColors(int[] nums) {
        int l = 0;
        int k = 0;
        int r = nums.length - 1;

        while(k <= r){
            if(nums[k] == 0){
                int temp = nums[l];
                nums[l] = nums[k];
                nums[k] = temp;
                k++;
                l++;
            }else if(nums[k] == 1){
                k++;
            }else{
                int temp = nums[k];
                nums[k] = nums[r];
                nums[r] = temp;
                r--;
            }
        }
    }
}