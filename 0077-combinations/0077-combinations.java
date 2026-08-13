class Solution {
    List<List<Integer>> ans=new ArrayList<>();
    List<Integer>sublist=new ArrayList<>();

    public void backtrack(int n, int k, int index, List<Integer> sublist){
        if(sublist.size()==k){
            ans.add(new ArrayList<>(sublist));
            return;
        }
        for(int i=index;i<=n;i++){
            sublist.add(i);
            backtrack(n,k,i+1,sublist);
            sublist.remove(sublist.size()-1);

        }
    }

    public List<List<Integer>> combine(int n,int k){
        backtrack(n,k,1,sublist);
        return ans;
    }
}