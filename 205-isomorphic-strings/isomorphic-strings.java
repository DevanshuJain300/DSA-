class Solution {
    public boolean isIsomorphic(String s, String t) {
        int sfreq[]=new int [256];
        int tfreq[]=new int [256];

        for(int i=0;i<s.length();i++){
            char ch1=s.charAt(i);
            char ch2=t.charAt(i);

            if(sfreq[ch1]==0 && tfreq[ch2]==0){
                sfreq[ch1]=ch2;
                tfreq[ch2]=ch1;
            }
            else if(sfreq[ch1]!=ch2 || tfreq[ch2]!=ch1){
                return false;
            }
        }
        return true;
    }
}