// class Solution {
//     public int Helper(int n){
//         if( n==1 || n==2 ){
//             return n;   
//         }
//         int ans = Helper(n-1) + Helper(n-2);
//         return ans;
//     }
//     public int climbStairs(int n) {
//         return Helper(n);
//     }
// }
class Solution {
    HashMap<Integer,Integer> dp=new HashMap<>();

    public int climbStairs(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        
        if(dp.containsKey(n)){
            return dp.get(n);
        }
        int ans=climbStairs(n-1) + climbStairs(n-2);

            dp.put(n,ans);
        return ans;
    }
}