class Solution {
    
    public boolean isHappy(int n) {
        
        int slow=n;
        int fast=n;
        do{
            slow=fun(slow);
            fast=fun(fun(fast));
        }
        while(slow!=fast);
        return slow==1;
 
    }
    public int fun(int num){
            int sum=0;
            while(num>0){
                int n=num%10;
                sum+=n*n;
                num=num/10;
            }
            return sum;
        }
}