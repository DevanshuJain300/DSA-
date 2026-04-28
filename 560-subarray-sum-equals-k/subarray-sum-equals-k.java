class Solution {
    public int subarraySum(int[] nums, int k) {
     HashMap<Integer,Integer> map=new HashMap<>();
     int prefixSum=0;
     map.put(0,1);
     int count=0;
     for(int i=0;i<nums.length;i++){
        prefixSum=prefixSum+nums[i];
        int sum=prefixSum-k;
        if(map.containsKey(sum)){
            count=count+map.get(sum);
        }
        
        map.put(prefixSum,map.getOrDefault(prefixSum,0)+1);
        
     }
     return count;

    }
}