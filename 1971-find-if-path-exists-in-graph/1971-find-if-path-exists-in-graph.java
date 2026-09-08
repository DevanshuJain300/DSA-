class Solution {

    public boolean validPath(int n, int[][] edges,
                             int source, int destination) {

        // Create adjacency list
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        // Undirected graph
        for (int[] edge : edges) {

            int u = edge[0];
            int v = edge[1];

            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        boolean[] visited = new boolean[n];

        return dfs(graph, source, destination, visited);
    }

    public boolean dfs(ArrayList<ArrayList<Integer>> graph,
                       int node, int destination,
                       boolean[] visited) {

        // Destination reached
        if (node == destination) {
            return true;
        }

        visited[node] = true;

        for (int nei : graph.get(node)) {

            if (!visited[nei]) {

                if (dfs(graph, nei, destination, visited)==true) {
                    return true;
                }
            }
        }

        return false;
    }
}