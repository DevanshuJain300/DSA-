class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
       HashSet<Integer>hs=new HashSet<>();
       HashSet<Integer>ans=new HashSet<>();

       for(int n:nums1){
        hs.add(n);
       }

       for(int n:nums2){
        if(hs.contains(n)){
            ans.add(n);
        }
       }
       int res[]=new int[ans.size()];
         int i=0;
       for(int n:ans){
      
        res[i++]=n;
       }
       return res;
    }
}