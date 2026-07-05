class Solution {
    public int maxNumberOfBalloons(String text) {
        int[] freq=new int [26];
        for(char ch: text.toCharArray()){
            freq[ch - 'a']++;
        }
       //int x= Math.min(freq['b'-'a'] , freq['a'-'a'] , freq['n'-'a'] , freq['l'-'a']/2 , freq['o'-'a']/2 );
        
         int ans = freq['b' - 'a'];                           //because math.min allows only 2 arguements at a time
        ans = Math.min(ans, freq['a' - 'a']);
        ans = Math.min(ans, freq['l' - 'a'] / 2);
        ans = Math.min(ans, freq['o' - 'a'] / 2);
        ans = Math.min(ans, freq['n' - 'a']);

        return ans;
    }
}