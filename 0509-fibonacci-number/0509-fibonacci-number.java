class Solution {
    HashMap<Integer,Integer> dp =new HashMap<>();

    public int fib(int n) {

        if (n<=1){
            return n;
        }
        int ans=fib(n-1)+fib(n-2);
        if(dp.containsKey(n)){
            return dp.get(n);
        }
        dp.put(n,ans);
        return ans;
    }
}