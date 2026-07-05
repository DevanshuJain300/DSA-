class Solution {
    public int longestPalindrome(String s) {
        int len=0; 
        int freq[]=new int [128];
        for(char ch:s.toCharArray()){
            freq[ch]++;
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]%2==0){
                len=len+freq[i];
            }
            else{
                len=len+freq[i]-1;                 //use all characters, except 1, use it at the end
            }
        }
        if(len<s.length()){
                len++;
            }
        return len;
    }
}