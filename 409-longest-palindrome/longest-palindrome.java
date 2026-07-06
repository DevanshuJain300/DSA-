class Solution {
    public int longestPalindrome(String s) {
        int len=0; 
        int freq[]=new int [128];
        for(char ch:s.toCharArray()){  // in this case , size of array is 128 because it contain A-Z also
            freq[ch]++;                //since it also contain A-Z, freq[ch-'a']++ is wrong
                                       // ASCII A-Z = 65-90 , a-z = 97-122
                                       //we can use 123,124, 125,...   but 128 is standard choice
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