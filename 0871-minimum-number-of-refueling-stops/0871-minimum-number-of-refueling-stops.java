class Solution {
    public int minRefuelStops(int target, int startFuel, int[][] stations) {
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b) -> b-a);

        int maxReach=startFuel;
        int i=0;
        int stops=0;

        while(maxReach<target){
            while(i<stations.length && stations[i][0]<=maxReach){
                pq.offer(stations[i][1]);
                i++;
            }
            if(pq.isEmpty()){
                return -1;
            }
            maxReach= maxReach+pq.poll();
            stops++;
        }
        return stops;
    }
}