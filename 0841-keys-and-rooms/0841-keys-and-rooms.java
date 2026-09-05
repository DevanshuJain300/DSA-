class Solution {

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {

        int n = rooms.size();

        boolean[] visited = new boolean[n];

        dfs(rooms, 0, visited);

        // Check whether every room was visited
        for (int i = 0; i < n; i++) {

            if (!visited[i]) {
                return false;
            }
        }

        return true;
    }

    public void dfs(List<List<Integer>> rooms,
                    int room,
                    boolean[] visited) {

        // Mark current room as visited
        visited[room] = true;

        // Visit all rooms for which we have keys
        for (int key : rooms.get(room)) {

            if (!visited[key]) {
                dfs(rooms, key, visited);
            }
        }
    }
}