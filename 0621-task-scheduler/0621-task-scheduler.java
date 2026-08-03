class Solution {
    public int leastInterval(char[] tasks, int n) {
    int[] ch=new int[26];
    for(char i:tasks){
        ch[i-'A']++;
    }        
    Arrays.sort(ch);
    
    int maxFreq=ch[25];
    int gaddhe=maxFreq-1;
    int idleSlots=n*gaddhe;

    for(int i=24;i>=0;i--){
        idleSlots=idleSlots - Math.min (ch[i] , gaddhe);
    }
    if(idleSlots>0){
        return tasks.length + idleSlots;
    }
    return tasks.length;
    }
}
