class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int n= nums.length  ;
        int zero=0;
        int one=0;
        int result=0;
        for (int i=0;i<n;i++){
            if(nums[i]==0){
                zero++;
            }
            else one++;
            int diff=zero-one;
            if(diff==0){
                result=Math.max(result,i+1);
            }
            if(map.containsKey(diff)){
                result=Math.max(result,i-map.get(diff));
            }
            else{
                map.put(diff,i);
            }

        }
        return result;
    }
}