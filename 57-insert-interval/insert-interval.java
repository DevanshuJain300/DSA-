import java.util.*;

class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int n=intervals.length;
        int[][] arr=new int[n+1][2];

        for(int i=0;i<n;i++){
            arr[i]=intervals[i];
        }
        arr[n]=newInterval;

        Arrays.sort(arr,(a,b)->Integer.compare(a[0],b[0]));
        ArrayList<int[]> result=new ArrayList<>();
        int start=arr[0][0];
        int end=arr[0][1];
        for(int i=1;i<arr.length;i++){
            if(arr[i][0]<=end){
                end=(Math.max(end,arr[i][1]));
            }
            else{
                result.add(new int []{start,end});
                start=arr[i][0];
                end=arr[i][1];
            } 
        }        
            result.add(new int[]{start,end});
            return result.toArray(new int[result.size()][]);
        }
}