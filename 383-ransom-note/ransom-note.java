class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length()>magazine.length()){
            return false;
        }
        HashMap<Character,Integer>map1=new HashMap<>();

        for(char ch:magazine.toCharArray()){
            map1.put(ch,map1.getOrDefault(ch,0)+1);
        }
          for(char i: ransomNote.toCharArray()){
            if(!map1.containsKey(i) || map1.get(i)<=0){
                return false;
            }
            else{
                map1.put(i,map1.get(i)-1);
            }
          }
        return true;
    }
}