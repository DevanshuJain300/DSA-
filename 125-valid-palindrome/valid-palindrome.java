class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        s=s.replaceAll("[^a-z0-9]","");
        int rp=s.length()-1;
        int lp=0;
        while(lp<=rp){
            if(s.charAt(lp)!=s.charAt(rp)){
                return false;
            }else{
                lp++;
                rp--;
            }  
        } 
                    return true;

        
    }
}