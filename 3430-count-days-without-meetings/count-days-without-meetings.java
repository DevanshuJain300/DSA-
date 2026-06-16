class Solution {
    public int countDays(int days, int[][] meetings) {
        Arrays.sort(meetings,(a,b)->Integer.compare(a[0],b[0]));

        int od=0;    //occupied days
        int start=meetings[0][0];
        int end=meetings[0][1];
        for(int i=1;i<meetings.length;i++){
            if(meetings[i][0]<=end){
                end=Math.max(end,meetings[i][1]);
            }
            else{
                od= od + (end-start+1);
                start=meetings[i][0];
                end=meetings[i][1];
            }
        }
        od= od + (end-start+1);
        return days-od;    //total days-occupied days
 
    }
}