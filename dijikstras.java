import java.util.*;

class Graph {    
    static  int V ;

    public static int minDistance(int dist[], Boolean sptSet[]) {
        int min = Integer.MAX_VALUE, min_index = -1;

        for (int i = 0; i < V; i++)
            if (sptSet[i] == false && dist[i] <= min) {
                min = dist[i];
                min_index = i;
            }

        return min_index;
    }

    public static void dijkstra(int graph[][], int src) {
        int dist[] = new int[V];
        Boolean sptSet[] = new Boolean[V];
    
        Arrays.fill(dist,Integer.MAX_VALUE);
        Arrays.fill(sptSet,false);
        dist[src] = 0;

        for (int count = 0; count < V - 1; count++) {
            int u = minDistance(dist, sptSet);
            sptSet[u] = true;
            for (int i = 0; i < V; i++)
                if (!sptSet[i] && graph[u][i] != 0 && dist[u] != Integer.MAX_VALUE && dist[u] + graph[u][i] < dist[i])
                    dist[i] = dist[u] + graph[u][i];
        }
        printSolution(dist);
    }

    public static void printSolution(int dist[]) {
        System.out.println("Vertex \t\t Distance from Source");
        for (int i = 0; i < V; i++)
            System.out.println(i + " \t\t " + dist[i]);
    }

    public static void main(String[] args) {
          int graph[][] = new int[][] 
                { { 0, 4, 0, 0, 0, 0, 0, 8, 0 }, 
                { 4, 0, 8, 0, 0, 0, 0, 11, 0 },
                { 0, 8, 0, 7, 0, 4, 0, 0, 2 }, 
                { 0, 0, 7, 0, 9, 14, 0, 0, 0 }, 
                { 0, 0, 0, 9, 0, 10, 0, 0, 0 },
                { 0, 0, 4, 14, 10, 0, 2, 0, 0 }, 
                { 0, 0, 0, 0, 0, 2, 0, 1, 6 }, 
                { 8, 11, 0, 0, 0, 0, 1, 0, 7 },
                { 0, 0, 2, 0, 0, 0, 6, 7, 0 } };
                    
            V=graph.length;

        dijkstra(graph, 0);
    }

}