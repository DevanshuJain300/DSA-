// class NumArray {
//  int[] nums;
//     public NumArray(int[] nums) {
//          this.nums = nums;
//     }
    
//     public int sumRange(int left, int right) {
//        int sum=0;
//         for(int i=left;i<=right;i++){
//             sum=sum+nums[i];
//         }
//         return sum;
//     }
// }


// optimal solution
class NumArray{
    int[] prefixSum;
    public NumArray(int[] nums){
        int n=nums.length;
         prefixSum=new int [n];
         prefixSum[0]=nums[0];

         for(int i=1;i<n;i++){
            prefixSum[i]=prefixSum[i-1]+nums[i];
         }
    }
        
        public int sumRange(int left,int right){
            if(left==0){
                return prefixSum[right];
            }
            else{
                return prefixSum[right]-prefixSum[left-1];
            }
        }
    
}

