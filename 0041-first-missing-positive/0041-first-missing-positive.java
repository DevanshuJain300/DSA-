class Solution {
    public int firstMissingPositive(int[] nums) {
        //int[] filteredNums = Arrays.stream(nums).filter(n -> n > 0).toArray();
        
        Arrays.sort(nums);
        
        int target = 1;
        for (int n : nums) {
            if (n == target) {
                target++;
            } else if (n > target) {
                return target;
            }
        }
        
        return target;        
    }
}