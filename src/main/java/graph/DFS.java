package graph;

import static graph.AdjucencyListGraph.addEdge;

/**
 * @author Abhijeet Gulve
 */
public class DFS {
    private static boolean[] marked;
    private static int[] edgeTo;
    private static int s;

    public static void main(String[] args) {
        int V = 5;
        AdjucencyListGraph graph = new AdjucencyListGraph(V);
        addEdge(graph, 0, 1);
        addEdge(graph, 0, 4);
        addEdge(graph, 1, 2);
        addEdge(graph, 1, 3);
        addEdge(graph, 1, 4);
        addEdge(graph, 2, 3);
        addEdge(graph, 3, 4);
        marked = new boolean[V];
        edgeTo = new int[V];
        dfs(graph, 0);
        for (int i = 0; i < edgeTo.length; i++) {
            System.out.print(edgeTo[i] + " ");
        }
    }

    private static void dfs(AdjucencyListGraph adjucencyListGraph, Integer v) {
        System.out.println(v);
        marked[v] = true;
        for (int i = 0; i < adjucencyListGraph.adjList[v].size(); i++) {
            if (!marked[adjucencyListGraph.adjList[v].get(i)]) {
                dfs(adjucencyListGraph, adjucencyListGraph.adjList[v].get(i));
                edgeTo[adjucencyListGraph.adjList[v].get(i)] = v;
            }
        }
    }

}
