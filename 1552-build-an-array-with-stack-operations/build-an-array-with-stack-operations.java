class Solution {
    public List<String> buildArray(int[] target, int n) {
    List<String> res=new ArrayList<>();
    int i=1;
    for(int j: target){
        while(i<j){
            res.add("Push");
            res.add("Pop");
            i++;
        }
        res.add("Push");
        i++;
    }
      return res;
    }
}