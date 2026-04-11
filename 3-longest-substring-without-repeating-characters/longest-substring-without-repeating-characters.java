class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0;
        int maxLength=0;
        HashSet<Character>hs=new HashSet<>();
        for(int i=0;i<s.length();i++){
            while(hs.contains(s.charAt(i))){
                hs.remove(s.charAt(l));
                l++;
            }
            hs.add(s.charAt(i));
            maxLength=Math.max(i-l+1,maxLength);
        }
        return maxLength;
    }
}